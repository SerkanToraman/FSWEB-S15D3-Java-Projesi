package com.WorkintechS19G3.model;

import com.WorkintechS19G3.model.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeData {

        LinkedList<Employee> allEmployeeList;
        Map<Integer, Employee> uniqueEmployees;
        LinkedList<Employee> dublicateEmployees;
                ;

    public EmployeeData(LinkedList<Employee> allEmployeeList, Map<Integer, Employee> uniqueEmployees, LinkedList<Employee> dublicateEmployees) {
        this.allEmployeeList = allEmployeeList;
        this.uniqueEmployees = uniqueEmployees;
        this.dublicateEmployees = dublicateEmployees;
    }

    public void processEmployeeData(){
        System.out.println("\nAll Employee Listesi:");
        for (Employee employee :allEmployeeList ){
            System.out.println(employee);
        }
        Iterator<Employee> iterator = allEmployeeList.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(uniqueEmployees.containsKey(employee.getId())|| uniqueEmployees.containsValue(employee) ){
                dublicateEmployees.add(employee);
                iterator.remove();
            }else{
                uniqueEmployees.put(employee.getId(), employee);
            }
        }
        System.out.println("\nDuplicate Employees:");
        for (Employee duplicate : dublicateEmployees) {
            System.out.println(duplicate);
        }
        System.out.println("\nUnique Employees Map:");
        for (Employee employee : uniqueEmployees.values()) {
            System.out.println(employee);
        }

    }
}
