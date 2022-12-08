package com.blackflower.eleventhlab;

import java.util.ArrayList;

public class Factory {
    String factoryName;
    Material[] materials = new Material[5];
    
    ArrayList<Employee> employees = new ArrayList<>();
    
    void AddMaterial(int index, Material material){
        if (index > 0 && index < materials.length) {
            materials[index] = material;
        }
    }
    
    void RemoveMaterial(String materialTitle){
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].title == materialTitle) {
                materials[i] = null;
            }
        }
    }
    
    void GetMaterialCount(){
        System.out.println(materials.length);
    }
    
    int TotalPriceOfMaterials(){
        int total = 0;
        for (Material material : materials) {
            total += material.price;
        }
        return total;
    }
    
    void AddEmployee(Employee employee){
        employees.add(employee);
    }
    
    void RemoveMatByGivenPrice(int minPrice){
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].price < minPrice) {
                materials[i] = null;
            }
        }
    }
    
    int TotalIncreasedPrice(String title, int increaseAmount){
        int totalIncrease = 0;
        for (Material material : materials) {
            if (material != null && material.title == title) {
                material.price += increaseAmount;
                totalIncrease += increaseAmount;
                if (material.price < 5) {
                    material.price += 2;
                    totalIncrease += 2;
                }
            }
        }
        return totalIncrease;
    }
    
    void AssignMaterial(String firstName, String lastName, Material material){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).fistName == firstName && employees.get(i).lastName == lastName ) {
                employees.get(i).responsibleMaterials.add(material);
            }
        }
    }
    
    void ListEmployeesWithNoResponsibleMat(){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).responsibleMaterials.size() == 0) {
                System.out.println(employees.get(i).fistName + " " + employees.get(i).lastName);
            }
        }
    }
    
    void ListEmployeesBySalaryAndMatPrice(){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).TotalResponsibleMaterialPrice() < employees.get(i).salary) {
                System.out.println(employees.get(i).fistName + " " + employees.get(i).lastName);
            }
        }
    }
    
    
}
