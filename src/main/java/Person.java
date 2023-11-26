public abstract class Person implements Contactable {
    protected String name;
    protected String contactNum;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
    return name;
    }


    // Ad Hoc Polymorphism
    public static void type(Patient pat){
        System.out.println("This is Patient");
    }
    // Ad Hoc Polymorphism
    public static void type(Doctor doc){
        System.out.println("This is Doctor");
    }

    // The following method can be replaced by the keyword "abstract"
    // add before to "contact" method and "Person" class
//    public void contact(String message){
//        System.out.println(message);
//    }

    public abstract void contact(String message);
}
