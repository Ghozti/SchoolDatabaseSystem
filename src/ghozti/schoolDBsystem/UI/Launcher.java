package ghozti.schoolDBsystem.UI;

import ghozti.schoolDBsystem.constants.Constants;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        Options options = new Options();
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
                            System.out.println("[1] Students \n [2] Teachers \n [3] Classes \n [4] Schedules");
                            switch (scanner.nextInt()){
                                case 1:
                                    System.out.println("[1] By name \n [2] by ID");
                                    switch (scanner.nextInt()){
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("[1] By name \n [2] by ID");
                                    switch (scanner.nextInt()){
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.println("[1] By name \n [2] by ID");
                                    switch (scanner.nextInt()){
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                    }
                                    break;
                                case 4:
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
