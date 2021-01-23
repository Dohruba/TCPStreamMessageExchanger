package TCP;

import java.io.IOException;

public interface Server {

    /**
     * Makes the server side wait for a connection
     * @param port
     * @return
     * @throws IOException
     */
    Connection acceptConnection(int port) throws IOException;
}
