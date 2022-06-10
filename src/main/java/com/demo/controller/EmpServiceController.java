package com.demo.controller;

/**
 *
 * @author Amrita
 */
import com.demo.entity.Employees;
import com.demo.service.EmployeesService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//to mark the class as Controller
@RestController
public class EmpServiceController {
    
    //autowiring the service class
    @Autowired
    EmployeesService employeesService;
    
    //Create new
    @PostMapping("/employees")
    public int saveEmployees(@RequestBody Employees employees){
        employeesService.saveOrUpdate(employees);
        return employees.getEmpId();
    }
       
    //Update
    @PutMapping("/employees")
    public Employees update(@RequestBody Employees employees){
        employeesService.saveOrUpdate(employees);
        return employees;
    }
    
    //List All Employees
    @GetMapping("/employee")
    public List<Employees> getAllEmployees(){
        return employeesService.getAllEmployees();    
    }
    
    //Get detail of a specfic one
    @GetMapping("/employee/{empId}")
    public Employees getEmployees(@PathVariable("empId") int empId){
        return employeesService.getEmployeesById(empId);
    }
    
    //Delete
    @DeleteMapping("/employee/{empId}")
    public void deleteEmployee(@PathVariable("empId") int empId){
        employeesService.delete(empId);
    }
    
}
