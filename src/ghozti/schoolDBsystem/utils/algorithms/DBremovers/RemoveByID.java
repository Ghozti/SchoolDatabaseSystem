package ghozti.schoolDBsystem.utils.algorithms.DBremovers;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.schedule.Schedule;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class RemoveByID {

    /**
     * These methods work like getByID except once the object is found the object is removed from the list
     */

    public void removeS(ArrayList<Student> list, String ID){//for students
        for (int i = 0; i < list.size(); i++) {
            if (ID.equals(list.get(i).getID())){
                list.remove(i);
            }
        }
    }

    public void removeT(ArrayList<Teacher> list, String ID){//for teachers
        for (int i = 0; i < list.size(); i++) {
            if (ID.equals(list.get(i).getID())){
                list.remove(i);
            }
        }
    }

    public void removeC(ArrayList<Class> list, String ID){//for classes
        for (int i = 0; i < list.size(); i++) {
            if (ID.equals(list.get(i).getID())){
                list.remove(i);
            }
        }
    }

    public void removeSC(ArrayList<Schedule> list, String ID){//for schedules
        for (int i = 0; i < list.size(); i++) {
            if (ID.equals(list.get(i).getID())){
                list.remove(i);
            }
        }
    }
}
