package com.day2.models;
import com.day2.interfaces.Taxable;

public class FullTimeEmployee extends Employee implements Taxable {
  
   private double salary;
    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public double calculateSalary() {
        return salary;
    }
    @Override
    public double calculateTax() {
        return salary * 0.1;
    }

}
