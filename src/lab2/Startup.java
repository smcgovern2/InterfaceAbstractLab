package lab2;

import java.util.ArrayList;

public class Startup {
    public static void main(String[] args) {

        ArrayList<ProgrammingCourse> courses = new ArrayList<>();

        courses.add(new AdvancedJavaCourse("Advanced Java","300", 4.0, "Intro to Java"));
        courses.add(new IntroToProgrammingCourse("Intro to Programming", "100", 3.0));
        courses.add(new IntroJavaCourse("Intro to Java", "200", 3.0,"Intro to Programming"));

        for ( ProgrammingCourse course : courses) {
            System.out.printf("%S %s, %.2f credits\n",course.getCourseName(),course.getCourseNumber(),course.getCredits());

        }
        /*
        Interface inheritance is safer than concrete inheritance, with the only real drawback being that common methods must be rewritten. This is generally a good trade-off
        to make.

        This startup class makes use of liskov substitution to access any ProgrammingCourse class within the foreach loop, however only methods included in the interface can be accessed
        without writing additional logic. In this example, I cannot access the prerequisites field within the foreach loop as it does not exist in the interface.
         */
    }
}
