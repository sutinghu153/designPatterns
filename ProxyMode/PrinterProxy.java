package designPattern.ProxyMode;

/**
 *  代理类
 * @data2021/9/17,14:48
 * @authorMSI
 */
public class PrinterProxy implements Printerable {
    private String name;// 名字

    private Printer real;// 本人

    public PrinterProxy(){

    }

    public PrinterProxy(String name){
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null){
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String s) {
        realize();
        real.print(s);
    }

    public synchronized void realize(){
        if (real == null){
            real = new Printer(name);
        }
    }
}
