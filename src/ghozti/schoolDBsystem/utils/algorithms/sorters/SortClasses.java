package ghozti.schoolDBsystem.utils.algorithms.sorters;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.database.Classes;
import java.util.ArrayList;

public class SortClasses {

    public ArrayList<Classes> sort(){
        ArrayList<Class> ela = new ArrayList<>();
        ArrayList<Class> math = new ArrayList<>();
        ArrayList<Class> history = new ArrayList<>();
        ArrayList<Class> science = new ArrayList<>();
        ArrayList<Class> cs = new ArrayList<>();
        ArrayList<Class> gym = new ArrayList<>();

        for (int i = 0; i < Classes.getClasses().size(); i++){
            if (Classes.getClasses().get(i).getSubject().toLowerCase().equals("ela")){
                ela.add(Classes.getClasses().get(i));
            }else if (Classes.getClasses().get(i).getSubject().toLowerCase().equals("math")){
                math.add(Classes.getClasses().get(i));
            }else if (Classes.getClasses().get(i).getSubject().toLowerCase().equals("history")){
                history.add(Classes.getClasses().get(i));
            }else if (Classes.getClasses().get(i).getSubject().toLowerCase().equals("science")){
                science.add(Classes.getClasses().get(i));
            }else if (Classes.getClasses().get(i).getSubject().toLowerCase().equals("computer science")){
                cs.add(Classes.getClasses().get(i));
            }else if (Classes.getClasses().get(i).getSubject().toLowerCase().equals("gym")){
                gym.add(Classes.getClasses().get(i));
            }
        }
    }
}
