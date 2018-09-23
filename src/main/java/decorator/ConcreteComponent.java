package decorator;

/**
 * @author zhaojigang
 * @date 2018/9/23
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("真实操作");
    }
}
