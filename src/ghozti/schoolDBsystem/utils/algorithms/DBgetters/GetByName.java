package ghozti.schoolDBsystem.utils.algorithms.DBgetters;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class GetByName {

    public Student getByNameS(ArrayList<Student> studentArrayList, String target){
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (target.equals(studentArrayList.get(i).getName())){
                return studentArrayList.get(i);
            }
        }
        return null;
    }

    public Teacher getByNameT(ArrayList<Teacher> teacherArrayList, String target){
        for (int i = 0; i < teacherArrayList.size(); i++) {
            if (target.equals(teacherArrayList.get(i).getName())){
                return teacherArrayList.get(i);
            }
        }
        return null;
    }

    public Class getByNameC(ArrayList<Class> classArrayList, String target){
        for (int i = 0; i < classArrayList.size(); i++) {
            if (target.equals(classArrayList.get(i).getSubject())){
                return classArrayList.get(i);
            }
        }
        return null;
    }
}
