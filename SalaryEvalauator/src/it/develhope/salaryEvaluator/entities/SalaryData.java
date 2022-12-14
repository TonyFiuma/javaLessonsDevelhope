package it.develhope.salaryEvaluator.entities;

public class SalaryData{

    private double net;
    private double irpef;
    private double inps;
    private double tfr;

    /** Net salary */
    public double getNet( ){
        return net;
    }

    public void setNet(double net){
        this.net=net;
    }

    /** IRPEF tax */
    public double getIrpef( ){
        return irpef;
    }

    public void setIrpef(double irpef){
        this.irpef=irpef;
    }

    /** INPS tax */
    public double getInps( ){
        return inps;
    }

    public void setInps(double inps){
        this.inps=inps;
    }

    /** Net salary */
    public double getTfr( ){
        return tfr;
    }

    public void setTfr(double tfr){
        this.tfr=tfr;
    }
}
