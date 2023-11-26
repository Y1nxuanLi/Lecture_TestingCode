import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        // Lecture 1
        int numEggs = 6;
        switch (numEggs) {
            case 6:
                System.out.println("Half a dozen eggs");
                break;
            case 12:
                System.out.println("A dozen eggs");
                break;
            default:
                System.out.println("Other than 6 or 12 eggs");
        }
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
        }

        // Lecture 2&3
        System.out.println("##################################");
        int i=34;
        double d;
        d=i;
        System.out.println(d);
        d=(double) i;
        d = d+0.1;
        System.out.println(d);

        int h;
        h = (int)d;
        System.out.println(h);

        System.out.println("##################################");
        Patient pat1 = new Patient("John Smith");
        pat1.setBedPhoneNum("123123123");
        String pat1BedNum = pat1.getBedPhoneNum();
        System.out.println(pat1BedNum);
        pat1.contact("this");
        System.out.println(pat1.getName());

        Person prsn1 = pat1;
        System.out.println(prsn1.getName());
        prsn1.contact("Person Contact"); // Still got override
        // Following will have error, to protect patient's info
        // String prsn1BedNum = prsn1.getBedPhoneNum();

        //Explicitly casting, redundant?
        Person prsn2 = (Person)pat1;
        System.out.println(prsn2.getName());
        prsn2.contact("Person Contact"); // Still got override

        // Error!!!!
        // You CAN'T cast superclass to subclass
//        Person prsn3 = new Person("Bob Mike");
//        Patient pat2 = (Patient) prsn3;
//        System.out.println(pat2.getName());


        // Polymorphism
        System.out.println("##################################");
        Patient patient1 = new Patient ("John Smith");
        Doctor doctor1 = new Doctor ("Dr. Bob Nettles");
        Person person1 = (Person)patient1;
        Person person2 = (Person)doctor1;

        // Person is abstract now, and can't be instantiated
        // Person person3 = new Person("Police");

        // Ad Hoc Polymorphism
        Person.type(patient1);
        Person.type(doctor1);

        ArrayList<Person> persons = new ArrayList<Person>();
            // ArrayList<> is a generic class  --> This is Parametric Polymorphism;
        persons.add(person1);
        persons.add(person2);
        for(Person p:persons){
            System.out.println(p.getName());
            p.contact("Hospital is closing"); // Subtype Polymorphism & Abstract keyword
        }

        // Interface
        System.out.println("##################################");
        UltrasoundScanner us1 = new UltrasoundScanner();
        ArrayList<Contactable> contactList = new ArrayList<Contactable>();
        contactList.add(patient1);
        contactList.add(doctor1);
        contactList.add(us1);
        for(Contactable c:contactList){
            c.contact("All Units attention please!"); // Interface
        }

        // Subtype Polymorphism:
        //     Interface can allow two non-related class use same method.
        //     Abstract allow two subclasses use same method.
    }
}
