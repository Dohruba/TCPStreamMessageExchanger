package messengerTCP;

import message.Message;

import java.io.IOException;

public interface TCPMessageExchanger {

    /**
     * Send message to host
     * @param message
     * @param hostname
     * @param port
     * @throws IOException
     */
    void sendMessageOverTCP(Message message, String hostname, int port) throws Exception;

    /**
     * Recive message
     * @param port
     * @throws IOException
     */
    void reciveMessageOverTCP(int port) throws IOException;
}
