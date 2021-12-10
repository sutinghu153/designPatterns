package designPattern.ProxyMode;

/**
 * @data2021/9/17,14:53
 * @authorMSI
 */
public class test {

    public static void main(String[] args) {
        Printerable printerable = new PrinterProxy("sutinghu");
        System.out.println("现在的名字是"+printerable.getPrinterName());
        printerable.setPrinterName("bob");
        System.out.println("现在的名字是"+printerable.getPrinterName());
        printerable.print("i love you");

    }

}
