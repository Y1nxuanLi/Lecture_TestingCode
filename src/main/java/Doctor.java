public class Doctor extends Person{
    public Doctor(String name){
        super(name);
    }
    public String getDutyPhoneNum(){
        return contactNum;
    }

    public void getDutyPhoneNum(String dutyPhoneNum){
        Integer.parseInt(dutyPhoneNum);
        contactNum = dutyPhoneNum;
    }

    //Overrides contact inPerson
    public void contact(String msg){
        System.out.println("Contact to Doctor via Pager:");
        System.out.println(msg);
    }
}
