package ghozti.schoolDBsystem.student;

public class Student {

    private String name;
    private int age;
    private String birthDate;
    private int GPA;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBirthDate(){
        return birthDate;
    }

    public int getGPA(){
        return GPA;
    }

    public Student(String name,int age, String birthDate){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public Student(String name,int age, String birthDate,int GPA){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.GPA = GPA;
    }
}
