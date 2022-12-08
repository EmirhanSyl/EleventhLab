package com.blackflower.eleventhlab;

import java.util.ArrayList;

public class Employee {
    String fistName;
    String lastName;
    
    int salary;
    
    ArrayList<Material> responsibleMaterials = new ArrayList<>();
    
    public Employee(String firstName, String lastName, int salary){
        this.fistName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public Employee(String firstName, String lastName, int salary, Material material){
        this.fistName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        
        this.responsibleMaterials.add(material);
    }
    
    int TotalResponsibleMaterialPrice(){
        int total = 0;
        for (int i = 0; i < responsibleMaterials.size(); i++) {
            total += responsibleMaterials.get(i).price;
        }
        return total;
    }
}
