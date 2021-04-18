package ghozti.schoolDBsystem.UI;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.database.Classes;
import ghozti.schoolDBsystem.database.Students;
import ghozti.schoolDBsystem.database.Teachers;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import ghozti.schoolDBsystem.utils.IDmaker.IDmaker;

import java.util.Scanner;

public class Options {

    public void createClass(){

        Scanner scanner = new Scanner(System.in);
        IDmaker iDmaker = new IDmaker();

        String classname;
        String ID;
        Teacher teacher = null;
        int period;

        System.out.println();//TODO add dialogue constants (class name)
        classname = scanner.nextLine();//sets the class name

        //TODO call the create teacher function

        System.out.println();//TODO add dialogue constants (period)
        period = scanner.nextInt();//sets class period

        System.out.println();//TODO add constant for ID generated
        ID = iDmaker.idGenerator();
        System.out.println("[ID] ".concat(ID));

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
        IDmaker iDmaker = new IDmaker();

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

        System.out.println();//TODO add constant for ID generated
        var ID = iDmaker.idGenerator();
        System.out.println("[ID] ".concat(ID));

        Teachers.getTeachers().add(new Teacher(name,age,birthDate,subject,ID));//TODO get ID
    }

    public void createStudent(){

        Scanner scanner = new Scanner(System.in);
        IDmaker iDmaker = new IDmaker();

        String name;
        int age;
        String bday;
        double GPA;

        System.out.println();//TODO add a constant for the name
        name = scanner.nextLine();

        System.out.println();//TODO add a constant for the age
        age = scanner.nextInt();

        System.out.println();//TODO add a constant for the bday
        bday = scanner.nextLine();

        System.out.println();//TODO add constant for ID generated
        var ID = iDmaker.idGenerator();
        System.out.println("[ID] ".concat(ID));
        //TODO add an option where you can input the GPA

        Students.getStudents().add(new Student(name,age,bday,ID));
    }
}
