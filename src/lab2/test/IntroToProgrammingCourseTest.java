package lab2.test;

import lab2.IntroToProgrammingCourse;

import static org.junit.Assert.assertTrue;

public class IntroToProgrammingCourseTest {

    IntroToProgrammingCourse pc;

    @org.junit.Before
    public void setUp(){pc = new IntroToProgrammingCourse("ABC", "DEF", 3.0); }


    @org.junit.Test
    public void getCourseNumber() {assertTrue(pc.getCourseNumber().equals("DEF")); }

    @org.junit.Test
    public void getCredits() {
        assertTrue(pc.getCredits() == 3.0);
    }

    @org.junit.Test
    public void getCourseName() {
        assertTrue(pc.getCourseName().equals("ABC"));
    }
}