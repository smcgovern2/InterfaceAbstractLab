package lab2.test;

import lab2.AdvancedJavaCourse;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AdvancedJavaCourseTest {



    AdvancedJavaCourse pc;

    @org.junit.Before
    public void setUp(){pc = new AdvancedJavaCourse("ABC", "DEF",3.0,"GHI"); }


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