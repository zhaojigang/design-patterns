package decorator;

/**
 * @author zhaojigang
 * @date 2018/9/23
 */
public class Cilent {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 单个装饰
        Decorator decorator1 = new ConcreteDecorator1(component);
        Decorator decorator2 = new ConcreteDecorator2(component);
        // 装饰链（一层一层不断增加功能）
        Decorator decorator3 = new ConcreteDecorator2(decorator1);
        decorator1.operation();
        System.out.println("=================");
        decorator2.operation();
        System.out.println("=================");
        decorator3.operation();
    }
}
