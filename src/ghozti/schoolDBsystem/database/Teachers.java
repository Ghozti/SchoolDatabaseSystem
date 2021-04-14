package ghozti.schoolDBsystem.database;

import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class Teachers {

    private static ArrayList<Teacher> teachers = new ArrayList<>();

    public static ArrayList<Teacher> getTeachers(){
        return teachers;
    }
}
