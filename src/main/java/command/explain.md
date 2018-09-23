### 示例场景
例子来源于《设计模式之禅》。
假设有一个外包公司，有项目经理（Invoker）1人，需求组（ConcreteReceiver1）1组，美工组（ConcreteReceiver1）1组；
有一个客户（Client）需要做一个网站。

1. 首先，客户向项目经理发出一个命令（ConcreteCommand1）：增加一个页面；
2. 项目经理执行这个命令（实际上是告诉美工组组作真正的执行，当然也可能同时需要需求组的参与）

### Client
客户：

1. 构造Invoker实例
2. 创建Command命令
3. 将命令发送给Invoker
4. 调用Invoker执行命令
### Invoker
项目经理：

1. 接收命令setCommand
2. 执行命令command.execute()
### Command
封装每一条命令：

1. 设置命令的真正执行者Receiver实例
2. 调用Receiver实例执行真正的操作
### Receiver
美工组：

1. 执行真正操作

### 好处

1. Invoker（命令的调用者）与Receiver（命令的执行者）之间通过Command解耦，Invoker直接调用command.execute()，
不关心具体谁（ConcreteReceiver）来执行。（最佳实践：receiver由command自己封装了，不要由外界传入）
2. Command子类可扩展，Client（命令创造者）与Invoker耦合性弱。
假设现在需要执行ConcreteCommand2，则Client直接创建ConcreteCommand2实例，然后设置到Invoker中即可。Invoker基于接口调用，不用动代码。
3. 具体的Command可以被不同的Invoker重用
4. 可以将多个具体的Command组装成一个复合Command

### 坏处
每一个具体命令都是一个类，注意类的膨胀扩张。