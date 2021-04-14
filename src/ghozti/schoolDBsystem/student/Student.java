package ghozti.schoolDBsystem.student;

public class Student {

    private String name;//name of student
    private int age;//age of student
    private String birthDate;//birthdate of student
    private double GPA;//GPA of student

    //constructor #1 will allow the user to set the fields except GPA
    public Student(String name,int age, String birthDate){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    //constructor #2 will allow the user to set all fields
    public Student(String name,int age, String birthDate,double GPA){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.GPA = GPA;
    }

    //name getter
    public String getName(){
        return name;
    }

    //age getter
    public int getAge(){
        return age;
    }

    //birthdate getter
    public String getBirthDate(){
        return birthDate;
    }

    //GPA getter
    public double getGPA(){
        return GPA;
    }
}
