package message;

public interface Message {

    /**
     * What text is to be exchanged
     * @return
     * @throws Exception
     */
    String getMessage() throws Exception;

    /**
     *
     * @return the moment when the exchange happens
     * @throws Exception
     */
    long getTimeStamp() throws Exception;

    /**
     *
     * @return Who sent the message
     * @throws Exception
     */
    String getMessengerName() throws Exception;
}
