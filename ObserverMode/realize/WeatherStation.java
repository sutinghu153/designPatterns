package designPattern.ObserverMode.realize;

import designPattern.ObserverMode.ShowChange;

import java.util.Date;

/**
 *  使用观察者模式
 * @data2021/9/12,15:03
 * @authorsutinghu
 */
public class WeatherStation {

    public static void main(String[] args) {
        // 创建主题
        WeatherData subject = new WeatherData();

        // 创建观察者——观察者观察某个主题
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(subject,"sutinghu");

        // 创建观察者2号——观察者观察某个主题
        CurrentConditionsDisplay2 conditionsDisplay2 = new CurrentConditionsDisplay2(subject,"sutinghu2号");

        // 观察者把消息带给谁
        ShowChange showChange = new Shower();
        conditionsDisplay.setShowChange(showChange);

        // 观察者2号把消息带给谁
        ShowChange showChange2 = new Shower2();
        conditionsDisplay2.setShowChange(showChange2);


        subject.setMeasurements(new Date(),"第1次通知");

        subject.setMeasurements(new Date(),"第2次通知");

        subject.setMeasurements(new Date(),"第3次通知");

        // 当当前的观察者不想当观察者时
        conditionsDisplay.getSubject().reMoveObserver(conditionsDisplay);
        subject.setMeasurements(new Date(),"第4次通知");

    }

}
