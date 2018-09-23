package command;

import command.command.Command;

/**
 * 接收命令并调用真正的receiver去执行命令
 * 是command的代理
 */
public class Invoker {
    /**
     * 命令
     */
    private Command command;

    /**
     * 接受命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 调用真正的receiver去执行命令
     */
    public void action() {
        this.command.execute();
    }
}
