package ghozti.schoolDBsystem.UI;

import ghozti.schoolDBsystem.classes.Class;
import ghozti.schoolDBsystem.schedule.Schedule;
import ghozti.schoolDBsystem.student.Student;
import ghozti.schoolDBsystem.teacher.Teacher;

public class Displayer {

    public void displayStudent(Student student){
        System.out.println("[Name] ".concat(student.getName()));
        System.out.println("[Age] ".concat(Integer.toString(student.getAge())));
        System.out.println("[Birthdate] ".concat(student.getBirthDate()));
        System.out.println("[GPA] ".concat(Double.toString(student.getGPA())));
    }

    public void displayTeacher(Teacher teacher){

    }

    public void displaySchedule(Schedule schedule){

    }

    public void displayClass(Class clas$){

    }
}
