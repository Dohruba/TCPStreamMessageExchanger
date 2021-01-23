package messengerTCP;

import TCP.Client;
import TCP.Connection;
import TCP.Server;
import TCP.TCPConnector;
import message.Message;
import message.MessageExchangerImpl;
import message.MessageReciver;
import message.MessageSender;

import java.io.IOException;

public class TCPMessageExchangerImpl implements TCPMessageExchanger{
    @Override
    public void sendMessageOverTCP(Message message, String hostname, int port) throws Exception {
        Client client = new TCPConnector();
        Connection connection = client.connect(hostname, port);

        MessageSender ms = new MessageExchangerImpl();
        ms.sendMessage(message,connection.getOutputStream());
    }

    @Override
    public void reciveMessageOverTCP(int port) throws IOException {
        Server server = new TCPConnector();
        Connection connection = server.acceptConnection(port);

        MessageReciver mr = new MessageExchangerImpl();
        mr.reciveMessage(connection.getInputStreamer());

    }
}
