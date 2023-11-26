public class UltrasoundScanner implements Contactable, Rebootable{
    // A class can only have one extend, but can have multiple implements

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
}
