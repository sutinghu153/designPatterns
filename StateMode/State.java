package designPattern.StateMode;

/**
 * 状态接口
 * @data2021/9/22,12:38
 * @authorsutinghu
 */
public interface State {

    String getName();
    void doClock(Context context,int houer);// 设置时间
    void doUser(Context context);// 使用金库
    void doAlarm(Context context);// 按下警报
    void doPhone(Context context);// 正常通话

}
