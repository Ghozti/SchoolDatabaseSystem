package ghozti.schoolDBsystem;

import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.utils.AlphabeticalSorter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AlphabeticalSorter alphabeticalSorter = new AlphabeticalSorter();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i < 26; i++) {
            list.add(new Student());
        }
        alphabeticalSorter.sort();
    }
}
