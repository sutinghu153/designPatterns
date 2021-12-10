package designPattern.StateMode;

/**
 * @data2021/9/22,12:47
 * @authorMSI
 */
public class NightState implements State {

    private static NightState single = new NightState();

    private final String state = "夜晚";

    private NightState(){}

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
        if (9<=houer||houer<17){
            context.changeState(DayState.getIntance());
        }
    }

    @Override
    public void doUser(Context context) {
        context.recordLog("晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("晚上按下警报");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("晚上正常通话");
    }
}
