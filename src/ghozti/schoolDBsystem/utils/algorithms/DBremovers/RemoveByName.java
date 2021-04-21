package ghozti.schoolDBsystem.utils.algorithms.DBremovers;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class RemoveByName {

    /*
     * These methods will be used to remove an object in the data base based on their name value.
     * RemoveByNameS - used for students
     * RemoveByNameT - used for teachers
     * RemoveByNameC - used for classes
     */

    public void removeByNameS(ArrayList<Student> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(target)) {
                list.remove(i);
                return;
            }
        }
    }

    public void removeByNameT(ArrayList<Teacher> list, String target){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(target)){
                list.remove(i);
                return;
            }
        }
    }

    //NOTE this method will remove the first class with the value of the target therefore it is not recommended to use unless the specified class is unique
    public void removeByNameC(ArrayList<Class> list, String target){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(target)){
                list.remove(i);
                return;
            }
        }
    }
}
