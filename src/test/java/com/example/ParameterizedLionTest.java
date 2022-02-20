package com.example;
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
                {"Тест", false},
        };
    }
//(expected = Exception.class)
    @Test
    public void gethasManeLion() {
        try {
            Lion lion = new Lion(checkedMane);
            boolean actual = lion.hasMane;
            assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Произошла ошибка!");
        }
    }


}
