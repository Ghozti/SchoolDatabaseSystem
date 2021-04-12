package ghozti.schoolDBsystem.utils;

import ghozti.schoolDBsystem.student.Student;
import java.util.ArrayList;

public class RemoveByName {

    public void removeByName(ArrayList<Student> list, String target){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(target)){
                list.remove(i);
                return;
            }
        }
    }
}
