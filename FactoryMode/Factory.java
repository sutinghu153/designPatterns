package designPattern.FactoryMode;

/**
 *  工厂类
 * @data2021/9/13,18:01
 * @authorsutinghu
 */
public class Factory implements FactoryAwire{

    private RealizeFactory realizeFactory;

    @Override
    public RealizeFactory createRealize(String type){

        if (type.equals("TimeRealize")){
            realizeFactory = new TimeRealize();
        }
        return realizeFactory;
    }

}
