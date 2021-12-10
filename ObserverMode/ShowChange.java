package designPattern.ObserverMode;

import java.util.Date;

/**
 *  观察者收到变化通知后 会 把变化展示给第三方
 * @data2021/9/12,14:37
 * @authorsutinghu
 */
public interface ShowChange {

    /**
     *  所有的变化都通过这个方法同步
     */
    void disPlay(Date updateTime, int nums, String name);

}
