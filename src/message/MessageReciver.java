package message;

import java.io.IOException;
import java.io.InputStream;

public interface MessageReciver {
    /**
     * Recives the data on the Input Stream
     * @param is
     * @return the Message made by the information gathered
     * @throws IOException if the InputStream does not contain a Message
     */
    Message reciveMessage(InputStream is) throws IOException;
}
