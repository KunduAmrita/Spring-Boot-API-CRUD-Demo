package com.demo.service;

/**
 *
 * @author Amrita
 */
import com.demo.entity.Employees;
import com.demo.repository.EmployeesRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// to define the business logic resides within the service layer 
@Service
public class EmployeesService {
    // autowiring the repository class
    @Autowired
    EmployeesRepo employeesRepo;
    
    //to save an employee using save()
    public void saveOrUpdate(Employees employees){
        employeesRepo.save(employees);
    }
    
    //to fetch all employee details using findAll()
    public List<Employees> getAllEmployees(){
    List<Employees> employees = new ArrayList<Employees>();
    employeesRepo.findAll().forEach(employees1 -> employees.add(employees1));
    return employees;    
    }
    
    //to fetch a specific employee details with empId using findById()
    public  Employees getEmployeesById(int id){
    return employeesRepo.findById(id).get();    
    }
    
    //to update info of an employee
    public void update(Employees employees, int empId){
        employeesRepo.save(employees);    
    }
    
    //to remove an Employee by id
    public void delete(int id){
        employeesRepo.deleteById(id);
    }
}

