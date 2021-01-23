package util;

import messengerTCP.TCPMessageExchangerImpl;

import java.io.IOException;

public class Guy1 {


    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        int port = 5555;
        int secondPort = 5556;
        String message;

        Greeting();
        ExchangeMessage(5555);

    }

    private static void Greeting(){
        System.out.println("\n Chat starting...");
    }

    private static void ExchangeMessage(int port) throws IOException {

        TCPMessageExchangerImpl messageExchanger = new TCPMessageExchangerImpl();
        messageExchanger.reciveMessageOverTCP(port);

    }


}
