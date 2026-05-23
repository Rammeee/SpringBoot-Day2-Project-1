package com.day2;

import java.util.*;


import com.day2.interfaces.Taxable;
import com.day2.models.FullTimeEmployee;
import com.day2.models.PartTimeEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Taxable> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("abc",50000.0));
        employees.add(new FullTimeEmployee("def",60000.0));
        employees.add(new PartTimeEmployee("ghi",20.0,100));
        employees.add(new PartTimeEmployee("jkl",25.0,80));
        for(Taxable emp : employees) {
            System.out.println("Employee Name: " + ((com.day2.models.Employee)emp).getName());
            System.out.println("Salary: " + ((com.day2.models.Employee)emp).calculateSalary());
            System.out.println("Tax: " + emp.calculateTax());
            System.out.println("-----------------------------");
        }

        
    }
}
