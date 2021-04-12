package ghozti.schoolDBsystem;

import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.utils.AlphabeticalSorter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AlphabeticalSorter alphabeticalSorter = new AlphabeticalSorter();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 122; i > 96; i--) {
            list.add(new Student((char) i,15,"10/29/2005"));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        System.out.println("***");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(alphabeticalSorter.sort(list).get(i).getName());
        }
    }
}
