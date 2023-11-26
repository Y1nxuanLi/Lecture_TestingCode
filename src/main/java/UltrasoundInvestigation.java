public class UltrasoundInvestigation {
    private UltrasoundScanner uscan;
    public UltrasoundInvestigation(UltrasoundScanner uscan){
        this.uscan=uscan;
    }

    public void scan_no_error_handling(){
        int data = UltrasoundScanner.data;
        if (uscan.connect(1)) System.out.println("Connect Successfully ");
        uscan.start(1);
        System.out.println("Start Successfully ");
        uscan.readData(data);
        System.out.println("Data is read: " + data);
        uscan.disconnect(1);
        System.out.println("Disconnect Successfully ");
    }


    // Handling Exceptions by returns
    public ScanErr scan() {
        int data = UltrasoundScanner.data;
        if (!uscan.connect(1)) return ScanErr.SCAN_ERR_NO_CONNECT;
        if (!uscan.start(1)){
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


//    // Handling Exceptions
//    public ScanErr scan(){
//        if (!uscan.connect(0)) return ScanErr.SCAN_ERR_NO_CONNECT;
//        try {
//            if (!uscan.start(0)) {
//                uscan.disconnect(1);
//                return ScanErr.SCAN_ERR_NO_START;
//            }
//
//            if (uscan.readData(data) == 0) {
//                uscan.disconnect(1);
//                return ScanErr.SCAN_ERR_NO_DATAREAD;
//            }
//        }
//        catch(ScanException e){
//            uscan.disconnect(1);
//            System.out.println(e.getMessage());
//            System.out.println("Catch ScanException triggered. No Start or Dataread");
//            return ScanErr.SCAN_ERR_FATAL_SCANNER_ERROR;
//        }
//        uscan.disconnect(1);
//        return ScanErr.SCAN_SUCCESSS;
//    }

//    // Passing on Exceptions
//    public ScanErr scan() throws ScanException {
//        if (!uscan.connect(0)) return ScanErr.SCAN_ERR_NO_CONNECT;
//        if (!uscan.start(0)){
//            uscan.disconnect(1);
//            return ScanErr.SCAN_ERR_NO_START;
//        }
//        if (uscan.readData(data) == 0){
//            uscan.disconnect(1);
//            return ScanErr.SCAN_ERR_NO_DATAREAD;
//        }
//        uscan.disconnect(1);
//        return ScanErr.SCAN_SUCCESSS;
//    }


}
