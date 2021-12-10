package designPattern.FactoryMode;

/**
 *  工厂感知类
 * @data2021/9/13,18:06
 * @authorMSI
 */
public interface FactoryAwire {
    RealizeFactory createRealize(String type);
}
