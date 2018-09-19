package commandPattern.command;

import commandPattern.receiver.ConcreteReceiver1;
import commandPattern.receiver.Receiver;

/**
 * 具体的命令
 */
public class ConcreteCommand1 extends Command {

    /**
     * 设置命令执行者
     */
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    /**
     * 设置默认的命令执行者
     */
    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    /**
     * 执行命令
     * 调用真正的命令执行者执行任务
     */
    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
