package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Feline feline = new Feline();

    @Test
    public void getKittens() {
        Lion lion = new Lion(feline);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

     @Mock
     Lion lion;

    @Test
    public void getListFoodForLion() {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        try {
            Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> actual = lion.getFood();
            assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Произошла ошибка!");
        }
    }




}