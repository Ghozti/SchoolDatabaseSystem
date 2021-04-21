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
        System.out.println("[Name] ".concat(teacher.getName()));
        System.out.println("[Age] ".concat(Integer.toString(teacher.getAge())));
        System.out.println("[Birthdate] ".concat(teacher.getBirthDate()));
        System.out.println("[Subject] ".concat(teacher.getSubject()));
    }

    public void displaySchedule(Schedule schedule){
        System.out.println("[Classes] ");
        for (String i : schedule.getClasses()) System.out.println(i);
        System.out.println("[ID] ".concat(schedule.getID()));
    }

    public void displayClass(Class clas$){
        System.out.println("[Subject] ".concat(clas$.getSubject()));
        System.out.println("[ID] ".concat(clas$.getID()));
        System.out.println("[Class Teacher] ".concat(clas$.getClassTeacher().getName()));
        System.out.println("[Students] ");
        for (int i = 0; i < clas$.getClassSize(); i++) System.out.println(clas$.getStudents().get(i));
        System.out.println("[Period] ".concat(Integer.toString(clas$.getPeriod())));
        System.out.println("[Class size] ".concat(Integer.toString(clas$.getClassSize())));
    }
}
