package lab1.test;

import lab1.IntroToProgrammingCourse;
import lab1.ProgrammingCourse;

import static org.junit.Assert.*;

public class ProgrammingCourseTest {

    ProgrammingCourse pc;

    @org.junit.Before
    public void setUp(){
        pc = new IntroToProgrammingCourse("ABC", "DEF", 3.0);

    }


    @org.junit.Test
    public void getCourseNumber() {
        assertTrue(pc.getCourseNumber().equals("DEF"));
    }

    @org.junit.Test
    public void getCredits() {
        assertTrue(pc.getCredits() == 3.0);
    }

    @org.junit.Test
    public void getCourseName() {
        assertTrue(pc.getCourseName().equals("ABC"));
    }
}