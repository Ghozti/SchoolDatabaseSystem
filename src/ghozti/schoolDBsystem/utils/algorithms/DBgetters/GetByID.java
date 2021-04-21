package ghozti.schoolDBsystem.utils.algorithms.DBgetters;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class GetByID {

    /**
     * These methods are used to retrieve an object in the DB array lists based on their ID
     * getByIDS - for students
     * getByIDS - for teachers
     * getByIDC - for classes
     *
     * this is the most recommend method to use since it is accurate to retrieving the specified object.
     */

    public Student getByIDS(ArrayList<Student> studentArrayList, String target){
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (target.equals(studentArrayList.get(i).getID())){
                return studentArrayList.get(i);
            }
        }
        return null;
    }

    public Teacher getByIDT(ArrayList<Teacher> teacherArrayList, String target){
        for (int i = 0; i < teacherArrayList.size(); i++) {
            if (target.equals(teacherArrayList.get(i).getID())){
                return teacherArrayList.get(i);
            }
        }
        return null;
    }

    public Class getByIDC(ArrayList<Class> classArrayList, String target){
        for (int i = 0; i < classArrayList.size(); i++) {
            if (target.equals(classArrayList.get(i).getID())){
                return classArrayList.get(i);
            }
        }
        return null;
    }
}
