package designPattern.SingletonMode;

/**
 *  不需要加锁 就可以实现线程安全
 * @data2021/9/13,19:42
 * @authorsutignhu
 */
public class Singleton2 {

    private static  Singleton2 uniqueIntance = new Singleton2();

    private Singleton2(){}

    public static  Singleton2 getInstance(){
        if (uniqueIntance == null){
            // 双重线程锁 解决性能问题
            if (uniqueIntance == null){
                uniqueIntance = new Singleton2();
            }
        }
        return uniqueIntance;
    }

}
