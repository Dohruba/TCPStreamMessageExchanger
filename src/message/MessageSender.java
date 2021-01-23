package message;

import java.io.OutputStream;

public interface MessageSender {

    /**
     * Sends the specified message through the specified Output Stream
     * @param message
     * @param os
     * @throws Exception
     */
    void sendMessage(Message message, OutputStream os) throws Exception;
}
