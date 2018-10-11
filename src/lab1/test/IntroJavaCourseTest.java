package lab1.test;

import lab1.IntroJavaCourse;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntroJavaCourseTest {

    IntroJavaCourse pc;

    @org.junit.Before
    public void setUp(){pc = new IntroJavaCourse("ABC", "DEF","GHI", 3.0); }


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

    @Test
    public void getPrerequisites() {
        assertTrue(pc.getPrerequisites().equals("GHI"));
    }
}