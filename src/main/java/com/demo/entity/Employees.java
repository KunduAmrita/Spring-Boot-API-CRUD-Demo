package com.demo.entity;

/**
 *
 * @author Amrita
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//to mark the class as an Entity
@Entity
//to define class name as table
@Table(name="employees")
public class Employees implements Serializable {
    //Id being the primary key
    @Id
    //Column for the table
    @Column
    private int empId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date birthDate; //yyyy-mm-dd format
    @Column
    private String gender;
    @Column
    private String country;

    //Getter Setter methods
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }   
    
}

