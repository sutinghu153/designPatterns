package designPattern.ObserverMode.realize;

import designPattern.ObserverMode.ShowChange;

import java.util.Date;

/**
 * @data2021/9/12,15:32
 * @authorMSI
 */
public class Shower implements ShowChange {

    @Override
    public void disPlay(Date updateTime, int nums, String name) {
            System.out.println("提出解决方案，针对通知："+name);
    }
}
