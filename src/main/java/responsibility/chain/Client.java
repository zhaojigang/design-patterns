package responsibility.chain;

import responsibility.chain.handler.ConcreteHandler1;
import responsibility.chain.handler.ConcreteHandler2;
import responsibility.chain.handler.Handler;

public class Client {
    public static void main(String[] args) {
        // 具体处理器1
        Handler handler1 = new ConcreteHandler1();
        // 具体处理器2
        Handler handler2 = new ConcreteHandler2();
        // 构建责任链
        handler1.setNextHandler(handler2);

        Request req1 = new Request("level1", "req1");
        Request req2 = new Request("level2", "req2");
        Request req3 = new Request("level3", "req3");
        // 将全部请求都丢到链头
        Response resp1 = handler1.handleRequest(req1);
        Response resp2 = handler1.handleRequest(req2);
        Response resp3 = handler1.handleRequest(req3);

        System.out.println(resp1);
        System.out.println(resp2);
        System.out.println(resp3);
    }
}
