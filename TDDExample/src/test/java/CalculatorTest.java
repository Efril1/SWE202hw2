/*
 * StudentID : B201202025
 * Name: Cenk Eren
 * Surname : CENGIZ
 * Course Name :SOFTWARE VERIFICATION AND VALIDATION
 * Homework Number : 2
 * Repository Address : https://github.com/Efril1/SWE202hw2.git
 */


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"10,2,5","10,4,2.5","12.5,5,2.5","10,2.5,4","12.5,2.5,5"})
    void dataDrivenDivide(double a, double b, double expectedValue) {

        assertEquals(expectedValue, Calculator.divide(a, b),
                "The result of Calculator.divide method is incorrect.");

    }

}