package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Connection {

    /**
     * Gets the Outputstream of the socket of the connection
     * @return
     * @throws IOException
     */
    OutputStream getOutputStream() throws IOException;

    /**
     * Gets the Inputstream of the socket of the connection
     * @return
     * @throws IOException
     */
    InputStream getInputStreamer() throws IOException;
}
