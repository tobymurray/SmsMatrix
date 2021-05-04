package eu.droogers.smsmatrix;

/**
 * Created by gerben on 9-10-17.
 */

class NotSendMessage {
    private String type;
    private String phone;
    private String body;

    public NotSendMessage(String phone, String body, String type) {
        this.phone = phone;
        this.body = body;
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public String getBody() {
        return body;
    }

    public String getType() {
        return type;
    }
}
