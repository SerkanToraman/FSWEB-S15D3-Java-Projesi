package com.WorkintechS19G3.main;

import com.WorkintechS19G3.model.Employee;
import com.WorkintechS19G3.model.EmployeeData;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1,"Serkan", "Toraman");
        Employee employee2 = new Employee(2,"Ann", "Ann");
        Employee employee3 = new Employee(3,"Bob", "Bob");
        Employee employee4 = new Employee(4,"Ahmet", "Ahmet");
        Employee employee5 = new Employee(5,"Mehmet", "Mehmet");
        Employee employee6 = new Employee(6,"Ayse", "Ayse");
        Employee employee7 = new Employee(1,"Veli", "Veli");
        Employee employee8 = new Employee(7,"Serkan", "Toraman");

        LinkedList<Employee> allEmployeeList= new LinkedList<>();
        allEmployeeList.add(employee1);
        allEmployeeList.add(employee2);
        allEmployeeList.add(employee3);
        allEmployeeList.add(employee4);
        allEmployeeList.add(employee5);
        allEmployeeList.add(employee6);
        allEmployeeList.add(employee7);
        allEmployeeList.add(employee8);

        LinkedList<Employee> dublicateEmployees = new LinkedList<>();
        Map<Integer, Employee> uniqueEmployees = new TreeMap<>();
        EmployeeData employees = new EmployeeData(allEmployeeList,uniqueEmployees,dublicateEmployees);

        employees.processEmployeeData();



    }
}