package decorator;

/**
 * @author zhaojigang
 * @date 2018/9/23
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addFunction2();
    }

    /**
     * 增加功能
     */
    public void addFunction2() {
        System.out.println("增加第二个功能");
    }
}
