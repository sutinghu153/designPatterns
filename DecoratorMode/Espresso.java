package designPattern.DecoratorMode;

/**
 * @data2021/9/14,18:23
 * @authorsutinghu
 */
public class Espresso extends Beverage{

    public Espresso(){
        desc = "espress";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
