package designPattern.CommandMode;

/**
 *  命令遥控器
 * @data2021/9/15,17:23
 * @authorMSI
 */
public class SimpleRemoteControl {

    Command command;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPresh(){
        command.execute();
    }
}
