package commandPattern;

import commandPattern.command.ConcreteCommand1;

/**
 * 命令模式调用端
 */
public class Client {
    public static void main(String[] args) {
        // 调用者Invoker
        Invoker invoker = new Invoker();
        // 创建命令（command自己封装了receiver） - 第一种方式
        ConcreteCommand1 concreteCommand1 = new ConcreteCommand1();
        // 创建receiver + command（receiver由外界传入） - 第二种方式
        // Receiver receiver = new ConcreteReceiver1();
        // ConcreteCommand1 command1 = new ConcreteCommand1(receiver);
        // invoker接收命令
        invoker.setCommand(concreteCommand1);
        // invoker执行命令（实际上是掉哦command中的receiver进行执行）
        invoker.action();
    }
}
