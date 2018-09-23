package decorator;

/**
 * @author zhaojigang
 * @date 2018/9/23
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        addFunction();
        super.operation();
    }

    /**
     * 增加功能
     */
    public void addFunction() {
        System.out.println("增加第一个功能");
    }
}
