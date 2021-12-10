package designPattern.StateMode;

/**
 *  实现的上下文的类
 * @data2021/9/22,12:53
 * @authorsutinghu
 */
public class ContextSimple implements Context{
    private State state;

    ContextSimple(){
        this.state = DayState.getIntance();
    }

    /**
     *  正常行为
     */
    public void action(String e){
        if (e.equals("按门铃")){
            state.doPhone(this);
        }
        if (e.equals("用金库")){
            state.doUser(this);
        }
        if (e.equals("非法闯入")){
            state.doAlarm(this);
        }
    }

    @Override
    public void setClock(int hours) {
        state.doClock(this,hours);
        System.out.println("时间设置为"+hours);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
        System.out.println("当前状态是"+state.getName());
    }

    @Override
    public void callSecurityCenter(String msg) {
        System.out.println(msg);
    }

    @Override
    public void recordLog(String msg) {
        System.out.println(msg);
    }
}
