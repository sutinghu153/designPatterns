package designPattern.StateMode;

/**
 * @data2021/9/22,12:56
 * @authorsutinghu
 */
public class Test {
    public static void main(String[] args) {
        ContextSimple contextSimple = new ContextSimple();
        contextSimple.setClock(17);
        contextSimple.action("按门铃");
        contextSimple.action("用金库");
        contextSimple.action("非法闯入");
    }
}
