package com.petproject.spring.rest;

import com.petproject.spring.rest.configuration.MyConfig;
import com.petproject.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee employee = communication.getEmployee(10);
        System.out.println(employee);

//        Employee emp = new Employee("Liza", "Tuktik", "Sales", 1050);
//        emp.setId(14);
//        communication.saveEmployee(emp);

//        communication.deleteEmployee(13);
    }
}
