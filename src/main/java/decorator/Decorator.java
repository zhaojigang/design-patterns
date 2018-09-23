package decorator;

/**
 * @author zhaojigang
 * @date 2018/9/23
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
