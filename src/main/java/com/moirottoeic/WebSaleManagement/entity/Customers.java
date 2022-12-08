/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.entity;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@Entity (name = "Customers")
@Table (name = "Customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CustomerID;
    private String Password;
    private String Fullname;
    private String Address;
    private String City;

    /**
     * @return the CustomerID
     */
    public Integer getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID the CustomerID to set
     */
    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Fullname
     */
    public String getFullname() {
        return Fullname;
    }

    /**
     * @param Fullname the Fullname to set
     */
    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }
    
}
