package designPattern.DecoratorMode;

/**
 * @data2021/9/14,18:26
 * @authorMSI
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
