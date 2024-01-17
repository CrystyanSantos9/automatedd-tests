package dev.cryss.math;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName ("Test Math Operations in SimpleMath Class")
class SimpleMathTestS4 {


    double firstNumber = 2D;
    double secondNumber = 5D;

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMath ();
        System.out.println ("Iniciando instancia de Simple Math antes de cada teste");
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println ("Para limpar o cenário após cada teste");
    }


    @DisplayName ("Test 10.0 / 2 = 5.0")
    @ParameterizedTest
//    @MethodSource("testDivisionInputParameters")
    @MethodSource()
    void division(double firstNumber, double secondNumber, double expected) {

        Double actual = math.division (firstNumber, secondNumber);

        assertEquals (expected, actual, 2D, ()-> firstNumber + " / " + secondNumber
                + " did not produce " + expected + "!");
        assertNotEquals (9.2D, actual);
        assertNotNull (actual);
    }

//    public static Stream<Arguments> testDivisionInputParameters(){
public static Stream<Arguments> division(){
        return Stream.of (
                Arguments.of (10.0D, 2D, 5.0D ),
                Arguments.of (71D, 14D, 5.07D ),
                Arguments.of (18.3D, 3.1D, 5.90D )
        );
    }

}