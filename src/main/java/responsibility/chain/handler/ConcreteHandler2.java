package responsibility.chain.handler;

import responsibility.chain.Request;
import responsibility.chain.Response;

/**
 * 具体处理器
 */
public class ConcreteHandler2 extends Handler {
    @Override
    protected String getHandlerLevel() {
        return "level2";
    }

    @Override
    protected Response echo(Request request) {
        return new Response("handler2 handle: " + request.getReq());
    }
}
