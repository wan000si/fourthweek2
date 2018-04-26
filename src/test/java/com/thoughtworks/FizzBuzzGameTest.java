package com.thoughtworks;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.contains3(13));
        assertFalse(fizzBuzzGame.contains3(15));
    }

    @Test
    public void should_return_Fizz_when_is_the_multiple_of_3() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isMultipleOf3(6));
        assertFalse(fizzBuzzGame.isMultipleOf3(15));
        assertFalse(fizzBuzzGame.isMultipleOf3(21));
    }

    @Test
    public void should_return_Buzz_when_is_the_multiple_of_5() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isMultipleOf5(20));
        assertFalse(fizzBuzzGame.isMultipleOf5(15));
        assertFalse(fizzBuzzGame.isMultipleOf5(35));
    }
    @Test
    public void should_return_Buzz_when_is_the_multiple_of_7() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isMultipleOf7(14));
        assertFalse(fizzBuzzGame.isMultipleOf7(21));
        assertFalse(fizzBuzzGame.isMultipleOf7(35));
    }

    @Test
    public void should_return_FizzBuzz_when_is_the_multiple_of3_5() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isMultipleOf3_5(15));
        assertFalse(fizzBuzzGame.isMultipleOf3_5(18));
    }
    @Test
    public void should_return_FizzWhizz_when_is_the_multiple_of3_7() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isMultipleOf3_7(21));
        assertFalse(fizzBuzzGame.isMultipleOf3_7(24));
    }

    @Test
    public void should_return_BuzzWhizz_when_is_the_multiple_of5_7() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isMultipleOf5_7(35));
        assertFalse(fizzBuzzGame.isMultipleOf5_7(65));
    }

    @Test
    public void should_return_FizzWhizz_when_is_the_multiple_of3_5_7() {
        FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
        assertTrue(fizzBuzzGame.isMultipleOf3_5_7(105));
        assertFalse(fizzBuzzGame.isMultipleOf3_5_7(24));
    }

}
