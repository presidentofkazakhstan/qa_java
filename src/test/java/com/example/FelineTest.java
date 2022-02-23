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
public class FelineTest {


    @Test
    public void getListEatMeat()  throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyOfFeline() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithKittensCount() {
        Feline feline = new Feline();
        int kittensCount = 5;
        int actual = feline.getKittens(kittensCount);
        int expected = kittensCount;
        assertEquals(expected, actual);
    }
}