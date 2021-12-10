package designPattern.DecoratorMode;

import java.io.File;
import java.io.FileInputStream;

/**
 * @data2021/9/14,18:29
 * @authorsutinghu
 */
public class OffeeTest {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc()+"，"+beverage.cost());

        /**
         *  实际不是同一个对象了
         */
        Beverage beverage1 = new HouseBlend();
        System.out.println(beverage1+beverage1.getDesc()+","+beverage1.cost());
        // designPattern.DecoratorMode.HouseBlend@1d44bcfahouseblend,0.89
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1+beverage1.getDesc()+","+beverage1.cost());
        // designPattern.DecoratorMode.Mocha@266474c2houseblend,mocha,1.09
        beverage1 = new DaMa(beverage1);
        System.out.println(beverage1+beverage1.getDesc()+","+beverage1.cost());

        FileInputStream fileInputStream;

    }

}
