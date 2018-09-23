package command.command;

import command.receiver.Receiver;

/**
 * 命令接口
 */
public abstract class Command {
    /**
     * 命令的具体执行者
     * 如果是多个receiver执行，使用List<Receiver>
     */
    protected final Receiver receiver;

    /**
     * 设置命令的具体执行者
     */
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 每个命令必须要做一件事情，实际上会调用具体的执行者receiver来做
     */
    public abstract void execute();
}
