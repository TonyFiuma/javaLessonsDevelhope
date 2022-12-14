package it.develhope.salaryEvaluator.buisnessLogic;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SalaryCalculatorTest{

    private static SalaryCalculator salaryCalculator;

    @BeforeAll
    public static void beforeAllTest(){
        salaryCalculator = new SalaryCalculator();
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("---------------- Before each test --------------");
    }

    @Test
    @Tag("tfr")
    public void evaluateTFR(){
    double tfr = salaryCalculator.evaluateTFR(30000);//If grossSalary is 30000 the result must be 2073
    Assertions.assertTrue(tfr > 0);
    //Assertion.assertEquals(2073, TFR);
    Assertions.assertTrue(Math.abs(2073 - tfr)< 0.01);
    }

    @Test
    @Tag("tfr")
    @Disabled
    public void evaluateTfrNegativeSalary(){
        double tfr = salaryCalculator.evaluateTFR(-30000);//If grossSalary is 30000 the result must be 2073
        Assertions.assertTrue(tfr < 0);
    }

    @ParameterizedTest
    @ValueSource(doubles = {30000,50000,10000})
    @Tag("tfr")
    public void evaluateTfrParametrized(double grossSalary){
        double tfr = salaryCalculator.evaluateTFR(grossSalary);
        Assertions.assertTrue(tfr > 0);
    }
}
