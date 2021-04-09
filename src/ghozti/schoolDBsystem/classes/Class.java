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

}
