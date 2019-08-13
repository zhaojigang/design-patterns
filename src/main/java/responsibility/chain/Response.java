package responsibility.chain;

public class Response {
    /**
     * 响应消息
     */
    private String resp;

    public Response(String resp) {
        this.resp = resp;
    }

    public String getResp() {
        return this.resp;
    }

    @Override
    public String toString() {
        return this.resp;
    }
}
