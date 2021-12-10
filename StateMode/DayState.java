package designPattern.StateMode;

/**
 *  白天状态
 * @data2021/9/22,12:44
 * @authorsutinghu
 */
public class DayState implements State {

    private static DayState single = new DayState();

    private final String state = "白天";

    private DayState(){}

    /**
     *  单例模式
     * @return
     */
    public static State getIntance(){
        return single;
    }

    @Override
    public String getName() {
        return state;
    }

    @Override
    public void doClock(Context context, int houer) {
        if (houer<9||17<=houer){
            context.changeState(NightState.getIntance());
        }
    }

    @Override
    public void doUser(Context context) {
        context.recordLog("白天使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("白天按下警报");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("白天正常通话");
    }
}
