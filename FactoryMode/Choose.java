package designPattern.FactoryMode;

/**
 *  决定要生产什么类型
 * @data2021/9/13,18:05
 * @authorsutinghu
 */
public class Choose {

    private FactoryAwire factoryAwire;

    Choose(FactoryAwire factoryAwire){
        this.factoryAwire = factoryAwire;
    }

    public RealizeFactory doCreate(String type){
       return factoryAwire.createRealize(type);
    }
}
