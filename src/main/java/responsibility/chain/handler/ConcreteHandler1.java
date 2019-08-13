package responsibility.chain.handler;

import responsibility.chain.Request;
import responsibility.chain.Response;

/**
 * 具体处理器
 */
public class ConcreteHandler1 extends Handler {
    @Override
    protected String getHandlerLevel() {
        return "level1";
    }

    @Override
    protected Response echo(Request request) {
        return new Response("handler1 handle: " + request.getReq());
    }
}
