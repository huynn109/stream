package dev.hw.app.streaming.model;

public class MessageStranger {

    public static final int TYPE_MESSAGE = 0;
    public static final int TYPE_LOG = 1;
    public static final int TYPE_ACTION = 2;

    private int mType;
    private String mMessage;
    private String mUsername;

    private MessageStranger() {
    }

    public int getType() {
        return mType;
    }

    ;

    public String getMessage() {
        return mMessage;
    }

    ;

    public String getUsername() {
        return mUsername;
    }

    ;


    public static class Builder {
        private final int mType;
        private String mUsername;
        private String mMessage;

        public Builder(int type) {
            mType = type;
        }

        public Builder username(String username) {
            mUsername = username;
            return this;
        }

        public Builder message(String message) {
            mMessage = message;
            return this;
        }

        public MessageStranger build() {
            MessageStranger message = new MessageStranger();
            message.mType = mType;
            message.mUsername = mUsername;
            message.mMessage = mMessage;
            return message;
        }
    }
}
