package lab1;

public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse course1 = new AdvancedJavaCourse("Advanced Java","300", "Intro to Java", 4.0);
        ProgrammingCourse course2 = new IntroToProgrammingCourse("Intro to Programming", "100", 3.0);
        IntroJavaCourse course3 = new IntroJavaCourse("Intro to Java", "200", "Intro to Programming", 4.0);

        course1.setCredits(4.0);
        course2.setCredits(3.0);
        course3.setCredits(4.0);

        System.out.println(course3.getPrerequisites());
        System.out.println(((AdvancedJavaCourse) course1).getPrerequisites());

        System.out.println(course1.getClass());
        System.out.println(course2.getClass());
        System.out.println(course3.getClass());
        /*
        The only advantage that i see in this method over interface inheritance is that time can be saved by not rewriting code.
        This method has much more opportunity for programmer error than interface inheritance.

        As far as being able to declare a subclass as a superclass, i see no value in this capability for this particular assignment, but i understand how this can be
        very useful in other applications, e.g. maintaining a collection of courses to be iterated through, using additional code/classes to handle differences between sublasses
         */

    }
}
