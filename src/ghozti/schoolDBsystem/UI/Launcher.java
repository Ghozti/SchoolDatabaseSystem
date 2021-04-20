package ghozti.schoolDBsystem.UI;

import java.util.Scanner;

public class Launcher {

    public void start(){
        Scanner scanner = new Scanner(System.in);
        Options options = new Options();
        int quit = 0;

        System.out.println("Enter what you wish to do: \n" +
                "[1] Add a class\n" +
                "[2] Add a schedule\n" +
                "[3] Add a teacher\n" +
                "[4] Add a student\n" +
                "[5] other\n" +
                "[6] quit");

        switch (scanner.nextInt()){
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
                break;
            case 6:
                quit = -1;
                break;
        }

        if (quit == -1) return;
        else start();
    }
}