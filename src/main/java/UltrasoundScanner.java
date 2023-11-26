public class UltrasoundScanner implements Contactable, Rebootable{
    // A class can only have one extend, but can have multiple implements
    static int SCAN_DATA_SIZE = 10;

    protected String model;

    public UltrasoundScanner(String model_name){
        this.model = model_name;
    }

    public String getModel(){
        return model;
    }

    public void contact(String message){
        System.out.println("Message to " + model + " UltrasoundScanner: ");
        System.out.println(message);
    }
    public void reboot(String message){
        System.out.println("UltrasoundScanner is rebooting");
        System.out.println(message);
    };

    public boolean connect(int x){
        boolean state = false;
        if (x == 1) state = true;
        if (x == 0 ) state = false;
        return state;
    }

    public boolean start(int x){
        boolean state = false;
        if (x == 1) state = true;
        if (x == 0 ) state = false;
        return state;
    }

    public int readData(byte[] x){
        int value = 0;
        for (byte b : x) {
            value = (value << 8) + (b & 0xFF);
        }
        return value;
    }

    public boolean disconnect(int x){
        boolean state = false;
        if (x == 1) state = true;
        if (x == 0 ) state = false;
        return state;
    }
}
