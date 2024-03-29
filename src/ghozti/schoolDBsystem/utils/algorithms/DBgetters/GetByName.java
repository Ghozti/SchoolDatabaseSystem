package ghozti.schoolDBsystem.utils.algorithms.DBgetters;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class GetByName {

    /**
     * These methods will be used to get an object in the database array lists based on their name value
     * getByNameS- for students
     * getByNameT - for teachers
     * getByNameC -  for classes
     *
     * The methods will take in a String which will be inputted by the user. Then the method will search through the array list and return the object
     * that contains the specified name
     */

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

    //NOTE this will return the first object with the given name value therefore it is not recommended to use for accurate results
    public Class getByNameC(ArrayList<Class> classArrayList, String target){
        for (int i = 0; i < classArrayList.size(); i++) {
            if (target.equals(classArrayList.get(i).getSubject())){
                return classArrayList.get(i);
            }
        }
        return null;
    }
}
