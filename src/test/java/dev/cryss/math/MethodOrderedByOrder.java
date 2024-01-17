package dev.cryss.math;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order (3)
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrder {

    StringBuilder actualValue = new StringBuilder ("");

    @AfterEach
    void afterEach(){
        System.out.println ("The Actual value is: "+ actualValue);
    }

    @Test
    @Order (2)
    void testA(){
        System.out.println ("Running Test A");
        actualValue.append ("A");
    }

    @Test
    @Order (3)
    void testB(){
        System.out.println ("Running Test B");
        actualValue.append ("A");
    }

    @Test
    @Order (1)
    void testC(){
        System.out.println ("Running Test C");
        actualValue.append ("A");
    }
}
