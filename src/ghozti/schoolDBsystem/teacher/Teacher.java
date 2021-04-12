package ghozti.schoolDBsystem.teacher;

public class Teacher {

    private String name;
    private int age;
    private String birthDate;
    private String subject;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public String getSubject(){
        return subject;
    }

    public Teacher(String name, int age, String birthDate, String subject){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.subject = subject;
    }
}
