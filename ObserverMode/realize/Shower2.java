package designPattern.ObserverMode.realize;

import designPattern.ObserverMode.ShowChange;

import java.util.Date;

/**
 * @data2021/9/12,16:10
 * @authorMSI
 */
public class Shower2 implements ShowChange {

    @Override
    public void disPlay(Date updateTime, int nums, String name) {
        System.out.println("开会讨论通知："+name);
    }

}
