package com.day2.models;

import com.day2.interfaces.Taxable;

public class PartTimeEmployee extends Employee implements Taxable{
    private double hourlyRate;
    private int hoursWorked;
  public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    @Override
    public double calculateTax() {
        return calculateSalary() * 0.5;
    }

}
