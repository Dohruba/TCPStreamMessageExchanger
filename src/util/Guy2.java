package util;

import message.Message;
import message.MessageImpl;
import messengerTCP.TCPMessageExchangerImpl;

import java.util.Date;

public class Guy2 {

    public static void main(String[] args) throws Exception {
        String hostname = "localhost";
        int port = 5555;
        int secondPort = 5556;
        String message = "Sent Message ";
        String messenger = "Guy2";
        Date date = new Date();
        Message toSend = new MessageImpl(messenger, date.getTime(), message);

        Greeting();
        ExchangeMessage(port,hostname, toSend );

    }

    private static void Greeting(){
        System.out.println("\n Chat starting...");
    }

    private static void ExchangeMessage(int port,String hostname, Message message) throws Exception {

        TCPMessageExchangerImpl messageExchanger = new TCPMessageExchangerImpl();
        messageExchanger.sendMessageOverTCP(message, hostname, port);

    }

}
