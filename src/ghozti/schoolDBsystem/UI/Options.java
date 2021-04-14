package ghozti.schoolDBsystem.UI;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.database.Classes;
import ghozti.schoolDBsystem.database.Schedules;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;

import java.util.Scanner;

public class Options {

    public void createClass(){

        Scanner scanner = new Scanner(System.in);

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
        Classes.getClasses().add(new Class(classname,ID,teacher,period));

        //TODO add an option that allows to add a list
    }

    public void createSchedule(){

        Scanner scanner = new Scanner(System.in);

        String[] classes;
        Student scheduleStudent = null;
        String studentName = scheduleStudent.getName();
        String ID;


    }

    public void createTeacher(){

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String birthDate;
        String subject;

        System.out.println();//TODO add a constant for the name
        name = scanner.nextLine();

        System.out.println();//TODO add a constant for age
        age = scanner.nextInt();

        System.out.println();//TODO add constant for bday
        birthDate = scanner.nextLine();

        System.out.println();//TODO add constant for subject
        subject = scanner.nextLine();
    }

    public void createStudent(){

    }
}
