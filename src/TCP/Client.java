package TCP;

import java.io.IOException;

public interface Client {

    /**
     * connects to the host that is functioning as a server
     * @param hostname
     * @param port
     * @return
     * @throws IOException
     */
    Connection connect(String hostname, int port) throws IOException;
}
