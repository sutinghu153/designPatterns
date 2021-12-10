package designPattern.ProxyMode;

/**
 *  打印机接口类
 *  万般打印机都有三个功能 打印什么
 * @data2021/9/17,14:34
 * @authorsutinghu
 */
public interface Printerable {

    // 打印机名字
    void setPrinterName(String name);
    // 设置打印机名字
    String getPrinterName();
    // 打印机打印内容
    void print(String s);

}
