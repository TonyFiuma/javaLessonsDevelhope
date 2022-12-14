package it.develhope.salaryEvaluator.buisnessLogic;

public class SalaryCalculator{

    /**
     * Evaluates TFR from salary
     * @param grossSalary salary before taxes
     * @return the TFR
     */
    protected double evaluateTFR(double grossSalary){
        return grossSalary * 6.91 / 100;
    }

    /**
     * Evaluates TFR from salary
     * @param grossSalary salary before taxes
     * @return the TFR
     */
    protected double evaluateINPS(double grossSalary){return grossSalary * 9.19 / 100;}/*
    Io mi sono fermato qui ma ha lui ha replicato i metodi e i test per tutti i valori(TFR, IRPEF, INPS)
   */
   }
