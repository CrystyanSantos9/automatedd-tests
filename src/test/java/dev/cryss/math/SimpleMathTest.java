package dev.cryss.math;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName ("Test Math Operations in SimpleMath Class")
class SimpleMathTest {


    double firstNumber = 2D;
    double secondNumber = 5D;

    SimpleMath math;

    @BeforeAll
    static void setup(){
        System.out.println ("Runnging Before All tests");
        System.out.println ("Usando para configurar, conexões, criar instâncias");

    }

    @AfterAll
    static void cleanup(){
        System.out.println ("Runnging after All tests");
        System.out.println ("Usando para desfazer configurações, acessos, conexões");
    }

    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMath ();
        System.out.println ("Iniciando instancia de Simple Math antes de cada teste");
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println ("Para limpar o cenário após cada teste");
    }

    @Test
    void sum() {

        Double actual = math.sum (firstNumber, secondNumber);

        var expected = 7L;
        assertEquals (expected, actual, ()-> firstNumber + " + " + secondNumber
        + "did not produce " + expected + "!");

        assertNotEquals (9.2D, actual);
        assertNotNull (actual);
    }

    @Test
    void subtraction() {
        Double actual = math.subtraction (firstNumber, secondNumber);
        var expected = -3;

        assertEquals (expected, actual, ()-> firstNumber + " + " + secondNumber
                + "did not produce " + expected + "!");
        assertNotEquals (9.2D, actual);
        assertNotNull (actual);

    }

    @Test
    //test[System Under Test]_[Condition or State change]_[Expected Results]
    @DisplayName ("Test 2 * 5 = 10")
    void multiplication() {
        Double actual = math.multiplication (firstNumber, secondNumber);
        var expected = 10;

        assertEquals (expected, actual, ()-> firstNumber + " + " + secondNumber
                + " did not produce " + expected + "!");
        assertNotEquals (9.2D, actual);
        assertNotNull (actual);
    }

    @Test
    void division() {
        Double zero = 0D;
        Double actual = math.division (firstNumber, zero);
        var expected = Double.POSITIVE_INFINITY;

        assertEquals (expected, actual, ()-> firstNumber + " / " + secondNumber
                + " did not produce " + expected + "!");
        assertNotEquals (9.2D, actual);
        assertNotNull (actual);
    }

    @Test
    @DisplayName ("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        int zero = 0;

        var expectedMessage = "/ by zero";

        ArithmeticException actual =  assertThrows (ArithmeticException.class, ()->
                math.division ((int) firstNumber, zero), "Divion By Zero must Throws ArithmeticException.class");

        assertEquals (expectedMessage, actual.getMessage (), "Unexpected exception message!");

    }


    @Test
    void mean() {
        Double actual = math.mean (firstNumber, secondNumber);
        var expected = 3.5;

        assertEquals (expected, actual, ()-> firstNumber + " / " + secondNumber
                + " did not produce " + expected + "!");
        assertNotEquals (9.2D, actual);
        assertNotNull (actual);
    }

    @Test
    @Disabled("TODO: we need still work on it!")
    void squareRoot() {
        Double actual = math.squareRoot (firstNumber);
        var expected = 1.4142135623730951;

        assertEquals (expected, actual, ()-> firstNumber + " / " + secondNumber
                + " did not produce " + expected + "!");
        assertNotEquals (9.2D, actual);
        assertNotNull (actual);
    }

}