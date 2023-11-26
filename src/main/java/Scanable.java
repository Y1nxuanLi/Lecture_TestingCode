public interface Scanable {
    boolean connect();
    boolean start() throws ScanException;
    int readData(byte[] data) throws ScanException;
    void disconnect();
}

