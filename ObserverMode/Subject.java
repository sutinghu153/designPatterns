package designPattern.ObserverMode;

/**
 *  观察者模式 ： 主题接口
 * @data2021/9/12,14:29
 * @authorsutinghu
 */
public interface Subject {

    /**
     *  观察者注册接口
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     *  删除观察者接口
     * @param observer
     */
    void reMoveObserver(Observer observer);

    /**
     *  当主题的状态改变时，该方法调用以通知所有的观察者
     */
    void notifyObserver();
}
