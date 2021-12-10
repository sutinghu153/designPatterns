package designPattern.ObserverMode;

import java.util.Date;

/**
 *  观察者模式 ：观察者接口
 * @data2021/9/12,14:31
 * @authorsutinghu
 */
public interface Observer {

    /**
     *  当主题的数据改变时，这个方法会被调用，所有的观察者都会实现该方法
     * @param updateTime
     * @param nums
     * @param name
     */
    void update(Date updateTime,int nums,String name);

}
