package ghozti.schoolDBsystem.utils;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.schedule.Schedule;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class RemoveByName {

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

    public void removeByNameC(ArrayList<Class> list, String target){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(target)){
                list.remove(i);
                return;
            }
        }
    }
}
