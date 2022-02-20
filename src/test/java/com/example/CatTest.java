package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Feline feline = new Feline();

    @Test
    public void getSoundCat() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

   @Mock
   Cat cat;

    @Test
    public void getListFoodToCat() {

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        try {
            Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> actual = cat.getFood();
            assertEquals(expected, actual);
        } catch (Exception exception ) {
            System.out.println("Произошла ошибка!");
        }
    }

}