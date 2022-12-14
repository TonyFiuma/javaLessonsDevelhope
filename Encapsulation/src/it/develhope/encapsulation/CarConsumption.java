package it.develhope.encapsulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarConsumption {

    private double water;
    private double fuel;
    private double oil;
}
