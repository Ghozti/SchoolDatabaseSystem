package ghozti.schoolDBsystem.schedule;

import ghozti.schoolDBsystem.student.Student;

public class Schedule {

    private String[] classes = new String[7];
    private Student scheduleStudent;
    private String studentName = scheduleStudent.getName();
    private String ID;

    public Schedule(Student student, String[] classes){
        scheduleStudent = student;
        this.classes = classes;
    }

    public Schedule(Student student, String ID, String[] classes){
        scheduleStudent = student;
        this.ID = ID;
        this.classes = classes;
    }

    public String[] getClasses(){
        return classes;
    }

    private Student getStudent(){
        return scheduleStudent;
    }

    private String getStudentName(){
        return studentName;
    }

    public String getID(){
        return ID;
    }
}
