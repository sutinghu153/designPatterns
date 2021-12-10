package designPattern.DecoratorMode;

/**
 * @data2021/9/14,18:49
 * @authorMSI
 */
public class DaMa extends CondimentDecorator{

    private Beverage beverage;

    public DaMa(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",DaMa";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.9;
    }

}
