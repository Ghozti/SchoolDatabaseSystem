package ghozti.schoolDBsystem.classes;

import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class Class {

    private String subject;//class subject name
    private String ID;//class ID
    private Teacher classTeacher;//name of class teacher
    private ArrayList<Student> students = new ArrayList<>();//array list containing student objects
    private int period;//class period number

    //First constructor (does not take in a student list)
    public Class(String subject, String ID, Teacher teacher, int period){
        this.subject = subject;
        this.ID = ID;
        this.classTeacher = teacher;
        this.period = period;
    }

    //Second constructor (takes in a student array list)
    public Class(String subject, String ID, Teacher teacher, int period, ArrayList<Student> studentList){
        this.subject = subject;
        this.ID = ID;
        this.classTeacher = teacher;
        this.period = period;
        students = studentList;
    }

    /***GETTERS***/
    public String getSubject(){//returns class subjects string
        return subject;
    }

    public String getID(){//returns class ID string
        return ID;
    }

    public Teacher getClassTeacher(){//returns the teacher object
        return classTeacher;
    }

    public ArrayList<Student> getStudents(){//returns the student array list
        return students;
    }

    public int getPeriod(){//returns the period int
        return period;
    }

    public int getClassSize(){//returns class size (array list size)
        return students.size();
    }


    //TODO maybe implement this to the final product !
    //***STUDENT UTILS***/
    public void addStudent(Student student){//allows to add a student to the list
        students.add(student);
    }

    /**
     * These 2 methods will be used to remove a student from the class
     * the first method allows to remove a student using an index
     * the second one allows to remove using the student name
     */
    public void removeStudent(int index){
        students.remove(index);
    }

    //***OVERLOAD***
    public void removeStudent(String name){
        //TODO make an algorithm that removes a student by name
    }
}
