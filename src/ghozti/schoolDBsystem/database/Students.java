package ghozti.schoolDBsystem.database;

import ghozti.schoolDBsystem.student.Student;
import java.util.ArrayList;

public class Students {

    private static ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents(){
        return students;
    }
}
