package ghozti.schoolDBsystem.UI;

import ghozti.schoolDBsystem.constants.Constants;
import ghozti.schoolDBsystem.database.Classes;
import ghozti.schoolDBsystem.database.Students;
import ghozti.schoolDBsystem.database.Teachers;
import ghozti.schoolDBsystem.utils.algorithms.DBgetters.GetByID;
import ghozti.schoolDBsystem.utils.algorithms.DBgetters.GetByName;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        Options options = new Options();
        GetByName getByName = new GetByName();
        Displayer displayer = new Displayer();
        GetByID getByID = new GetByID();
        int quit = 0;

        //user menu
        System.out.println("Enter what you wish to do: \n" +
                "[1] Add a class\n" +
                "[2] Add a schedule\n" +
                "[3] Add a teacher\n" +
                "[4] Add a student\n" +
                "[5] other\n" +
                "[6] quit");

        try {
            //input handler
            switch (scanner.nextInt()) {
                case 1:
                    options.createClass();
                    break;
                case 2:
                    options.createSchedule();
                    break;
                case 3:
                    options.createTeacher();
                    break;
                case 4:
                    options.createStudent();
                    break;
                case 5:
                    System.out.println(" [1] Print students\n [2] Print Teachers\n [3] Print classes \n [4] Print schedules \n [5] Scope");
                    switch (scanner.nextInt()) {
                        case 1:
                            options.displayStudents();
                            break;
                        case 2:
                            options.displayTeachers();
                            break;
                        case 3:
                            options.displayClasses();
                            break;
                        case 4:
                            options.displaySchedules();
                            break;
                        case 5:
                            System.out.println(" [1] Students \n [2] Teachers \n [3] Classes \n [4] Schedules");
                            switch (scanner.nextInt()){
                                case 1:
                                    System.out.println(" [1] By name \n [2] by ID");
                                    Scanner scanner1 = new Scanner(System.in);
                                    switch (scanner.nextInt()){
                                        case 1:
                                            System.out.println(Constants.Dialouge.setname);
                                            String name = scanner1.nextLine();
                                            displayer.displayStudent(getByName.getByNameS(Students.getStudents(),name));
                                            break;//TODO make the alphabetical sorted display display index.
                                        case 2:
                                            System.out.println(Constants.Dialouge.setID);
                                            String ID = scanner1.nextLine();
                                            displayer.displayStudent(getByID.getByIDS(Students.getStudents(),ID));
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("[1] By name \n [2] by ID");
                                    switch (scanner.nextInt()){
                                        case 1:
                                            System.out.println(Constants.Dialouge.setname);
                                            String name = scanner1.nextLine();
                                            displayer.displayTeacher(getByName.getByNameT(Teachers.getTeachers(),name));
                                            break;
                                        case 2:
                                            System.out.println(Constants.Dialouge.setID);
                                            String ID = scanner1.nextLine();
                                            displayer.displayStudent(getByID.getByIDS(Students.getStudents(),ID));
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("[1] By name \n [2] by ID");
                                    switch (scanner.nextInt()){
                                        case 1:
                                            System.out.println(Constants.Dialouge.setname);
                                            String name = scanner1.nextLine();
                                            displayer.displayClass(getByName.getByNameC(Classes.getClasses(),name));
                                            break;
                                        case 2:
                                            System.out.println(Constants.Dialouge.setID);
                                            String ID = scanner1.nextLine();
                                            displayer.displayClass(getByID.getByIDC(Classes.getClasses(),ID));
                                            break;
                                    }
                                    break;
                                case 4://TODO work on schedules
                                    System.out.println("[1] By name \n [2] by ID");
                                    switch (scanner.nextInt()){
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                    }
                                    break;
                            }
                    }
                    break;
                case 6:
                    quit = -1;
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println(Constants.Errors.inputError);
            start();
        }

        //if the user chooses option 6 then the program will stop
        if (quit == -1) return;
        else start();
    }
}
