package ghozti.schoolDBsystem.utils;

import ghozti.schoolDBsystem.student.Student;
import java.util.ArrayList;

public class AlphabeticalSorter {

    public ArrayList<Student> sort(ArrayList<Student> list){
        ArrayList<Student> nList = new ArrayList<>();
        for (int i = 96; i < 123; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getName().toLowerCase().charAt(0) == i){
                    nList.add(list.get(j));
                }
            }
        }
        return nList;
    }
}
