package ghozti.schoolDBsystem.UI;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.constants.Constants;
import ghozti.schoolDBsystem.database.Classes;
import ghozti.schoolDBsystem.database.Students;
import ghozti.schoolDBsystem.database.Teachers;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;
import ghozti.schoolDBsystem.utils.IDmaker.IDmaker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Options {

    public void createClass(){

        Scanner scanner = new Scanner(System.in);
        IDmaker iDmaker = new IDmaker();
        String classname;
        String ID;
        Teacher teacher = null;
        int period;

        try {
            System.out.println(Constants.Dialouge.setClassName);
            classname = scanner.nextLine();//sets the class name

            //TODO call the create teacher function

            System.out.println(Constants.Dialouge.setClassPeriod);
            period = scanner.nextInt();//sets class period

            System.out.println(Constants.Dialouge.generatingID);
            ID = iDmaker.idGenerator();
            System.out.println("[ID] ".concat(ID));

            Classes.getClasses().add(new Class(classname, ID, teacher, period));
        }catch (InputMismatchException e){
            System.out.println("***INVALID INPUT***");
        }
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

        try {
            System.out.println(Constants.Dialouge.setname);
            name = scanner.nextLine();

            System.out.println(Constants.Dialouge.setAge);
            age = scanner.nextInt();

            System.out.println(Constants.Dialouge.setBday);
            birthDate = scanner.nextLine();

            System.out.println(Constants.Dialouge.setSubject);
            subject = scanner.nextLine();

            System.out.println(Constants.Dialouge.generatingID);
            var ID = iDmaker.idGenerator();
            System.out.println("[ID] ".concat(ID));

            Teachers.getTeachers().add(new Teacher(name, age, birthDate, subject, ID));
        }catch (InputMismatchException e){
            System.out.println();
        }
    }

    public void createStudent(){

        Scanner scanner = new Scanner(System.in);
        IDmaker iDmaker = new IDmaker();

        String name;
        int age;
        String bday;
        double GPA;

        System.out.println(Constants.Dialouge.setname);
        name = scanner.nextLine();

        System.out.println(Constants.Dialouge.setAge);
        age = scanner.nextInt();

        System.out.println(Constants.Dialouge.setBday);
        bday = scanner.nextLine();

        System.out.println(Constants.Dialouge.generatingID);
        var ID = iDmaker.idGenerator();
        System.out.println("[ID] ".concat(ID));

        System.out.println("Would you like to input a GPA? \n [1] Yes \n [2] no");
        if(scanner.nextInt() == 1){
            System.out.println("Enter a GPA: ");
            Students.getStudents().add(new Student(name, age, bday, ID,scanner.nextDouble()));
        }else {
            Students.getStudents().add(new Student(name, age, bday, ID));
        }
    }
}
