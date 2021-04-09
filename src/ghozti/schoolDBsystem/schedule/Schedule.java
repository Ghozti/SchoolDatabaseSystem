package ghozti.schoolDBsystem.schedule;

import ghozti.schoolDBsystem.student.Student;

public class Schedule {

    private String[] classes = new String[7];
    private Student scheduleStudent;
    private String studentName = scheduleStudent.getName();
    private String ID;

    public Schedule(Student student){
        scheduleStudent = student;
    }

    public Schedule(Student student, String ID){
        scheduleStudent = student;
        this.ID = ID;
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
