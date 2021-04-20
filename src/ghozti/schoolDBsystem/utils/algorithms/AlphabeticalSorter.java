package ghozti.schoolDBsystem.utils.algorithms;

import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;

import java.util.ArrayList;

public class AlphabeticalSorter {

    public ArrayList<Student> sortS(ArrayList<Student> list){
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

    public ArrayList<Teacher> sortT(ArrayList<Teacher> list){
        ArrayList<Teacher> nList = new ArrayList<>();
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
