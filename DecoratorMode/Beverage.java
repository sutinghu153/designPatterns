package designPattern.DecoratorMode;

/**
 *
 * @data2021/9/14,18:19
 * @authorsutinghu
 */
public abstract class Beverage {

    String desc = "unknown beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();

}
