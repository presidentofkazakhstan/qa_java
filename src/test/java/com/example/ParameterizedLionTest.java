package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {

      String checkedMane;
      boolean expected;


    public ParameterizedLionTest(String checkedMane,boolean expected) {
        this.checkedMane = checkedMane;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getManeData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void gethasManeLion() throws Exception {
            Lion lion = new Lion(checkedMane);
            boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getHasManeLionWithException() throws Exception {
        Lion lion = new Lion("TEST");
        boolean actual = lion.hasMane;
        assertEquals(expected, actual);
    }
}
