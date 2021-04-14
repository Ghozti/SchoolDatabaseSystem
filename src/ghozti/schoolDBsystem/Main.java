package ghozti.schoolDBsystem;

import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.utils.AlphabeticalSorter;
import ghozti.schoolDBsystem.utils.RemoveByName;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AlphabeticalSorter alphabeticalSorter = new AlphabeticalSorter();
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("yesi",15,"20"));
        list.add(new Student("albert",15,"20"));
        list.add(new Student("brit",15,"20"));
        list.add(new Student("zeon",15,"20"));
        list.add(new Student("quebert",15,"20"));
        list.add(new Student("leon",15,"20"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        System.out.println("***");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(alphabeticalSorter.sort(list).get(i).getName());
        }

        RemoveByName removeByName = new RemoveByName();

        System.out.println("***");

        removeByName.removeByName(list,"yesi");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
