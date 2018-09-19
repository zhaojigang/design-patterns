package commandPattern.receiver;

/**
 * 真正的命令执行者接口
 */
public abstract class Receiver {
    /**
     * 真正的命令执行操作
     */
    public abstract void doSomething();
}
