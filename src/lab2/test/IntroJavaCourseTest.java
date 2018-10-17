package lab2.test;

import lab2.IntroJavaCourse;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntroJavaCourseTest {

    IntroJavaCourse pc;

    @org.junit.Before
    public void setUp(){pc = new IntroJavaCourse("ABC", "DEF",3.0, "GHI"); }


    @Test
    public void getCourseNumber() {assertTrue(pc.getCourseNumber().equals("DEF")); }

    @Test
    public void getCredits() {
        assertTrue(pc.getCredits() == 3.0);
    }

    @Test
    public void getCourseName() {
        assertTrue(pc.getCourseName().equals("ABC"));
    }

    @Test
    public void getPrerequisites() {
        assertTrue(pc.getPrerequisites().equals("GHI"));
    }
}