package ghozti.schoolDBsystem.utils.algorithms.sorters;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.database.Classes;
import java.util.ArrayList;

public class SortClasses {

    /*
        * This method will be used to sort classes based on it's subject number
     */

    public ArrayList<Class> sort(){

        /**
         * These array lists will be used to hold a specific class based on their name
         */

        /* ARRAY LISTS */
        ArrayList<Class> ela = new ArrayList<>();
        ArrayList<Class> math = new ArrayList<>();
        ArrayList<Class> history = new ArrayList<>();
        ArrayList<Class> science = new ArrayList<>();
        ArrayList<Class> cs = new ArrayList<>();
        ArrayList<Class> gym = new ArrayList<>();

        ArrayList<Class> finalList = new ArrayList<>();
        /* ARRAY LISTS END*/

        /**
         * This loop and statements will:
         * loop through every element in the array list in Classes in the DB
         * then get the subject name of that class object
         * then it will put the current object in it's corresponding list above
         */
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

        //at last all of the array lists will be combined into 1
        finalList.addAll(ela);
        finalList.addAll(math);
        finalList.addAll(history);
        finalList.addAll(science);
        finalList.addAll(cs);
        finalList.addAll(gym);

        return finalList;
    }
}
