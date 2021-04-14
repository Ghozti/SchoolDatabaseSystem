package ghozti.schoolDBsystem.database;

import ghozti.schoolDBsystem.classes.Class;
import java.util.ArrayList;

public class Classes {

    private static ArrayList<Class> classes = new ArrayList<>();

    public static ArrayList<Class> getClasses(){
        return classes;
    }
}
