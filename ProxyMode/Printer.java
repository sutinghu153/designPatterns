package designPattern.ProxyMode;

/**
 * @data2021/9/17,14:33
 * @authorMSI
 */
public class Printer implements Printerable{

    private String name;
    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    public Printer(){
        heavyJob("正在生成printer的实例");
    }

    public Printer(String name){
        this.name = name;
        heavyJob("正在生成printer的实例"+name);
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String s) {
        System.out.println("-------"+name+"--------");
        System.out.println(s);
    }

    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0;i<5;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("结束");
    }
}
