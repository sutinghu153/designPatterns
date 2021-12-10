package designPattern.SingletonMode;

/**
 *  双重锁安全模式
 * @data2021/9/13,19:43
 * @authorMSI
 */
public class Singleton3 {

    private static volatile Singleton3 uniqueIntance ;

    private Singleton3(){}

    public static  Singleton3 getInstance(){
        if (uniqueIntance == null){
            // 双重线程锁 解决性能问题
            synchronized (Singleton3.class){
                if (uniqueIntance == null){
                    uniqueIntance = new Singleton3();
                }
            }
        }
        return uniqueIntance;
    }

}
