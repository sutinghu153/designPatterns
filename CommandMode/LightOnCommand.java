package designPattern.CommandMode;

/**
 *  电灯命令
 * @data2021/9/15,17:20
 * @authorMSI
 */
public class LightOnCommand implements Command{

    private Light light;


    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
