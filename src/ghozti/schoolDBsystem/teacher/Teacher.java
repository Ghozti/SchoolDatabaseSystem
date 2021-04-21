package ghozti.schoolDBsystem.teacher;

public class Teacher {

    private String name;
    private int age;
    private String birthDate;
    private String ID;
    private String subject;

    //Constructor
    public Teacher(String name, int age, String birthDate, String ID, String subject){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.ID = ID;
        this.subject = subject;
    }

    /**GETTERS**/
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public String getID(){return ID;}

    public String getSubject(){
        return subject;
    }
}
