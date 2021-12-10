package designPattern.CommandMode;

/**
 * @data2021/9/15,17:25
 * @authorMSI
 */
public class Test {

    public static void main(String[] args) {
        // 要有灯
        Light light = new Light();
        // 要有遥控器
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        // 遥控命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        // 遥控
        simpleRemoteControl.buttonWasPresh();
    }

}
