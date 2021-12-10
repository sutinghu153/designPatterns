package designPattern.VisitorMode;

/**
 *  是否接受访问者访问
 * @data2021/9/23,12:47
 * @authorsutinghu
 */
public interface Element {
    void accept(Visitor visitor);
}
