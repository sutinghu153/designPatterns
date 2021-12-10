package designPattern.SingletonMode;

/**
 *  单例模式
 *
 *  问题：单例模式因为也是一个类，因此类加载器也可以同时产生它的实例，因此，要避免有同一个类的多个类加载器
 * @data2021/9/13,19:06
 * @authorsutinghu
 */
public class Singleton {

    /**
     *  volatile 保护多线程下不出现问题
     *  为什么不直接在类加载时创建实例？这样直接避免了类的多线程问题
     *      因为类被创建后，如果没有被引用，会被垃圾回收
     *      所以从性能和空间以及垃圾回收的角度 都应该在需要使用的时候才被创建
     */
    private static volatile Singleton uniqueIntance;

    /**
     *  私有化构造器类 被写在Java手册中
     *  其作用在使使用单例的类能够通过外部请求的方式创建 而不是外部直接创建
     */
    private Singleton(){}

    /**
     *  多线程下获取单例模式,避免单一类被频繁调用时，出现混乱
     * @return
     */
    public static synchronized Singleton getInstance(){
        if (uniqueIntance == null){
            uniqueIntance = new Singleton();
        }
        return uniqueIntance;
    }

}
