package designPattern.StateMode;

/**
 *  管理状态和警报的上下文
 * @data2021/9/22,12:41
 * @authorsutinghu
 */
public interface Context {

    void setClock(int hours);// 设置时间
    void changeState(State state);// 改变状态
    void callSecurityCenter(String msg);// 联系报警中心
    void recordLog(String msg);// 在报警中心留下记录

}
