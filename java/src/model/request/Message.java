package model.request;

import com.google.gson.JsonObject;

public class Message {
    private JsonObject message = new JsonObject();
    // 주석처럼 추가로 parameter를 늘릴 수 있습니다.
    public Message(String to, String from, String text/*, String type */) {
        this.message.addProperty("to", to);
        this.message.addProperty("from", from);
        this.message.addProperty("text", text);
//        this.message.addProperty("type", type);
    }
}
