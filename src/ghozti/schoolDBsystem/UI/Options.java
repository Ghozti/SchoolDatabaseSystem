package ghozti.schoolDBsystem.UI;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.database.Classes;
import ghozti.schoolDBsystem.teacher.Teacher;

import java.util.Scanner;

public class Options {

    public void createClass(){

        Scanner scanner = new Scanner(System.in);
        Classes classes = new Classes();

        String classname;
        String ID;
        Teacher teacher = null;
        int period;

        System.out.println();//TODO add dialogue constants (class name)
        classname = scanner.nextLine();//sets the class name

        System.out.println();//TODO add dialogue constants (ID)
        ID = scanner.nextLine();//sets class ID

        //TODO call the create teacher function

        System.out.println();//TODO add dialogue constants (period)
        period = scanner.nextInt();//sets class period
        classes.getClasses().add(new Class(classname,ID,teacher,period));

        //TODO add an option that allows to add a list

    }

    public void createTeacher(){

    }

    public void createSchedule(){

    }

    public void createStudent(){

    }
}
