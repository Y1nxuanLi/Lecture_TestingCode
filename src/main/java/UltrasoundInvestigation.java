public class UltrasoundInvestigation {
    private UltrasoundScanner uscan;
    private byte[] data = new byte[UltrasoundScanner.SCAN_DATA_SIZE];
    public UltrasoundInvestigation(UltrasoundScanner uscan){
        this.uscan=uscan;
    }

    public void scan_no_error_handling(){
        if (uscan.connect(1)) System.out.println("Connect Successfully ");
        uscan.start(1);
        System.out.println("Start Successfully ");
        uscan.readData(data);
        System.out.println("Data is read: " + data);
        uscan.disconnect(1);
        System.out.println("Disconnect Successfully ");
    }
    public byte[] getImage(){
        return data;
    }

    public ScanErr scan() {
        if (!uscan.connect(0)) return ScanErr.SCAN_ERR_NO_CONNECT;
        if (!uscan.start(0)){
            uscan.disconnect(1);
            return ScanErr.SCAN_ERR_NO_START;
        }
        if (uscan.readData(data) == 0){
            uscan.disconnect(1);
            return ScanErr.SCAN_ERR_NO_DATAREAD;
        }
        uscan.disconnect(1);
        return ScanErr.SCAN_SUCCESSS;
    }
}
