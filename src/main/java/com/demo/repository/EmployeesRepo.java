/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.repository;

/**
 *
 * @author Amrita
 */
import com.demo.entity.Employees;
import org.springframework.data.repository.CrudRepository;

//This repository extends CrudRepository which contains methods for CRUD operations. 
//It provides generic Crud operation on a repository.
public interface EmployeesRepo extends CrudRepository<Employees, Integer>{
    
}
