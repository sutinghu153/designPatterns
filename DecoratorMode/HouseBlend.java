package designPattern.DecoratorMode;

/**
 * @data2021/9/14,18:24
 * @authorsutinghu
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        desc = "houseblend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
