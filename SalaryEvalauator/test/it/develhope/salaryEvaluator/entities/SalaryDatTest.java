package it.develhope.salaryEvaluator.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryDatTest{

    @Test
    public void divideTest(){
        SalaryData salaryData = new SalaryData();
        salaryData.setNet(15000);
        salaryData.setInps(2000);
        salaryData.setIrpef(1000);
        salaryData.setTfr(500);


        Assertions.assertEquals(15000,salaryData.getNet());
        Assertions.assertEquals(2000,salaryData.getInps());
        Assertions.assertEquals(1000,salaryData.getIrpef());
        Assertions.assertEquals(500,salaryData.getTfr());
    }
}
