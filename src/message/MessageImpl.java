package message;

public class MessageImpl implements Message {

    private String message;
    private long timeStamp;
    private String messengerName;

    public MessageImpl(String messengerName, long timeStamp, String message){
        this.message = message;
        this.timeStamp = timeStamp;
        this.messengerName = messengerName;
    }

    @Override
    public String getMessage() throws Exception {
        return this.message;
    }

    @Override
    public long getTimeStamp() throws Exception {
        return this.timeStamp;
    }

    @Override
    public String getMessengerName() throws Exception {
        return this.messengerName;
    }
}
