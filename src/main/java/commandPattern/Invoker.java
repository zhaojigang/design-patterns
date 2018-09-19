package commandPattern;

import commandPattern.command.Command;

/**
 * 接收命令门面并调用真正的receiver去执行命令
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
