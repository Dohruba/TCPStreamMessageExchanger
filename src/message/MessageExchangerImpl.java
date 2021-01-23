package message;

import java.io.*;
import java.util.Date;

public class MessageExchangerImpl implements MessageReciver, MessageSender {
    @Override
    public Message reciveMessage( InputStream is) throws IOException {
        DataInputStream dais = new DataInputStream(is);

        String messenger = dais.readUTF();
        long timeStamp = dais.readLong();
        String message = dais.readUTF();

        Date date = new Date(timeStamp);
        System.out.print(messenger +": " + message + "  " + date);
        return new MessageImpl(messenger,timeStamp,message);
    }

    @Override
    public void sendMessage(Message message, OutputStream os) throws Exception {

        DataOutputStream daos = new DataOutputStream(os);
        daos.writeUTF(message.getMessengerName());
        daos.writeLong(message.getTimeStamp());
        daos.writeUTF(message.getMessage());
        daos.close();

    }
}
