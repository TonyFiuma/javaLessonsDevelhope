package it.develhope.encapsulation;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Car {

    private double power;
    private int doors;
    private double weight;
    private CarConsumption carConsumption = new CarConsumption();

    public void setDoors(int doors){
        if(this.doors>5)return;
        this.doors= doors;
    }

    public double getConsumption(){
        return carConsumption.getFuel();
    }
}
