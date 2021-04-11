package ghozti.schoolDBsystem.utils;

import ghozti.schoolDBsystem.student.Student;
import java.util.ArrayList;

public class AlphabeticalSorter {

    public ArrayList<Student> sort(ArrayList<Student> list){
        ArrayList<Student> nList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().charAt(0) == 'a'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'b'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'c'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'd'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'e'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'f'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'g'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'h'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'i'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'j'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'k'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'l'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'm'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'n'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'o'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'p'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'q'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'r'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 's'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 't'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'u'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'v'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'w'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'x'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'y'){
                nList.add(list.get(i));
            }else if (list.get(i).getName().toLowerCase().charAt(0) == 'z'){
                nList.add(list.get(i));
            }
            //TODO make this more efficient lol
        }
        return nList;
    }
}
