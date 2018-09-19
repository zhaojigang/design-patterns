package commandPattern.receiver;

/**
 * 真正的命令执行者
 */
public class ConcreteReceiver1 extends Receiver {
    /**
     * 真正的命令执行操作
     */
    @Override
    public void doSomething() {
        System.out.println("receiver1 doSomething");
    }
}
