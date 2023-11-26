public class UltrasoundScanner implements Contactable, Rebootable{
    // A class can only have one extend, but can have multiple implements
    public static int data;

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

    public int readData(int data){

        this.data = data;
        return this.data;
    }

    public boolean disconnect(int x){
        boolean state = false;
        if (x == 1) state = true;
        if (x == 0 ) state = false;
        return state;
    }


}

