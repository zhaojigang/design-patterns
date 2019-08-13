package responsibility.chain.handler;

import responsibility.chain.Request;
import responsibility.chain.Response;

/**
 * 处理器抽象类
 */
public abstract class Handler {
    /**
     * 下一个处理器
     */
    private Handler nextHandler;

    /**
     * 模板方法 - 外界直接使用的入口
     * 如果是要自己处理的，则自己处理，否则交由下一个处理器处理，如果没有处理器，则直接报错
     */
    public final Response handleRequest(Request request) {
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            return this.echo(request);
        } else {
            if (this.nextHandler != null) {
                return this.nextHandler.handleRequest(request);
            } else {
                System.out.println("No handler handle request" + request);
            }
        }
        return null;
    }

    /**
     * 处理器水平，决定将来要使用哪一个处理器进行处理
     */
    protected abstract String getHandlerLevel();

    /**
     * 子类真正的处理请求的逻辑
     */
    protected abstract Response echo(Request request);

    /**
     * 设置下一个处理器
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
