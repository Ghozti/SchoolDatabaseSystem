package ghozti.schoolDBsystem.classes;

import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class Class {

    private String subject;
    private String ID;
    private Teacher classTeacher;
    private ArrayList<Student> students = new ArrayList<>();
    private int period;

    public String getSubject(){
        return subject;
    }

    public String getID(){
        return ID;
    }

    public Teacher getClassTeacher(){
        return classTeacher;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public int getPeriod(){
        return period;
    }

    public int getClassSize(){
        return students.size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(int index){
        students.remove(index);
    }

    //***OVERLOAD***
    public void removeStudent(String name){
        //TODO make an algorithm that removes a student by name
    }
}
