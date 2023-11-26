public class Patient extends Person{
    public Patient(String name){
        super(name);
    }
    public String getBedPhoneNum(){
        return contactNum;
    }

    public void setBedPhoneNum(String bedPhoneNum){
        Integer.parseInt(bedPhoneNum);
        contactNum = bedPhoneNum;
    }

    //Overrides contact inPerson
    public void contact(String msg){
        System.out.println("Contact to Patient via msg:");
        System.out.println(msg);
    }
}
