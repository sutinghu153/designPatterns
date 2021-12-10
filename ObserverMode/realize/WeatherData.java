package designPattern.ObserverMode.realize;

import designPattern.ObserverMode.Observer;
import designPattern.ObserverMode.Subject;

import java.util.ArrayList;
import java.util.Date;

/**
 *  定义一个主题：天气数据的主题
 * @data2021/9/12,14:41
 * @authorsutinghu
 */
public class WeatherData implements Subject {

    // 这是这个现实主题的所有观察者
    private ArrayList<Observer> observers;

    // 这是主题通知的数据
    private Date updateTime;// 通知的时间
    private int nums;// 第几次通知
    private String name;// 某次通知的主题名

    /**
     *  定义一个实现类的构造方法 对本类要通知的数据 进行初始化
     */
    WeatherData(){
        nums = 0;
        observers = new ArrayList<Observer>();
    }

    /**
     *  注册新的观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     *  移除该主题下的某个观察者
     * @param observer
     */
    @Override
    public void reMoveObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     *  将变化通知给每个观察者
     */
    @Override
    public void notifyObserver() {
        for (Observer observer:observers) {
            observer.update(updateTime,nums,name);
        }
    }

    /**
     *  当内部的数据改变时，通知观察者
     */
    public void measurementsChanged(){
        notifyObserver();
    }

    /**
     *  主题更新内容,更新完后通知观察者
     */
    public void setMeasurements(Date updateTime,String name){
        this.updateTime = updateTime;
        this.nums++;
        this.name = name;
        measurementsChanged();
    }
}
