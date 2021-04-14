package ghozti.schoolDBsystem.database;

import ghozti.schoolDBsystem.schedule.Schedule;
import java.util.ArrayList;

public class Schedules {

    private static ArrayList<Schedule> schedules = new ArrayList<>();

    public  static  ArrayList<Schedule> getSchedules(){
        return schedules;
    }
}
