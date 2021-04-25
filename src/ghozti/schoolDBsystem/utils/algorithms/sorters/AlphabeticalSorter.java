package ghozti.schoolDBsystem.utils.algorithms.sorters;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import java.util.ArrayList;

public class AlphabeticalSorter {

    /**
     * These methods:
     * will take an array list (Student or teacher) and will iterate through every element inside it.
     * Then it will get the first character and compare it to a character in the ASCII table. Then the method will return a new array list which is based on the sorted names.
     */

    public ArrayList<Student> sortS(ArrayList<Student> list){
        ArrayList<Student> nList = new ArrayList<>();//new list
        for (int i = 96; i < 123; i++) {//loop that goes through every letter in the ASCII table
            for (int j = 0; j < list.size(); j++) {//loop that iterates through the list elements
                if (list.get(j).getName().toLowerCase().charAt(0) == i){
                    nList.add(list.get(j));//will add the current element to the list if the first letter corresponds to i
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

    public ArrayList<Class> sortC(ArrayList<Class> list){
        ArrayList<Class> nList = new ArrayList<>();
        for (int i = 96; i < 123; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getSubject().toLowerCase().charAt(0) == i){
                    nList.add(list.get(j));
                }
            }
        }
        return nList;
    }
}
