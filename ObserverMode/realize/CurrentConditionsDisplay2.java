package designPattern.ObserverMode.realize;

import designPattern.ObserverMode.Observer;
import designPattern.ObserverMode.ShowChange;
import designPattern.ObserverMode.Subject;

import java.util.Date;

/**
 *  某个观察者汇报主题的变化
 * @data2021/9/12,14:56
 * @authorsutinghu
 */
public class CurrentConditionsDisplay2 implements Observer {

    private Subject subject;

    private String myName;

    private ShowChange showChange;
    /**
     *  构造器
     * @param subject
     */
    CurrentConditionsDisplay2(Subject subject,String name){
        this.myName = name;
        this.subject = subject;
        subject.registerObserver(this);
    }

    public Subject getSubject() {
        return subject;
    }

    public void setShowChange(ShowChange showChange) {
        this.showChange = showChange;
    }

    /**
     *  更新显示器的主题内容
     * @param updateTime
     * @param nums
     * @param name
     */
    @Override
    public void update(Date updateTime, int nums, String name) {
        System.out.println(myName+"发来报告："+subject);
        showChange.disPlay(updateTime, nums, name);
    }

}