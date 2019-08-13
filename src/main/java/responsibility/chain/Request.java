package responsibility.chain;

public class Request {
    private String requestLevel;
    /**
     * 请求消息
     */
    private String req;

    public Request(String requestLevel, String req) {
        this.requestLevel = requestLevel;
        this.req = req;
    }

    public String getRequestLevel() {
        return requestLevel;
    }

    public String getReq() {
        return req;
    }

    @Override
    public String toString() {
        return this.req;
    }
}
