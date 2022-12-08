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
@Entity (name = "Category")
@Table (name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CategoryID;
    private String Name;
    private String Description;

    /**
     * @return the CategoryID
     */
    public Integer getCategoryID() {
        return CategoryID;
    }

    /**
     * @param CategoryID the CategoryID to set
     */
    public void setCategoryID(Integer CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
