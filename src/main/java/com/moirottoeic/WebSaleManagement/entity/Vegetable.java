/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@Entity (name = "Vegetable")
@Table (name = "Vegetable")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer VegetableID;
    
    private String VegetableName;
    
    private String Unit;
    
    private Integer Amount;
    
    private String Image;
    
    private Double Price;
    
    private Integer CategoryID;

    /**
     * @return the VegetableID
     */
    public Integer getVegetableID() {
        return VegetableID;
    }

    /**
     * @param VegetableID the VegetableID to set
     */
    public void setVegetableID(Integer VegetableID) {
        this.VegetableID = VegetableID;
    }

    /**
     * @return the VegetableName
     */
    public String getVegetableName() {
        return VegetableName;
    }

    /**
     * @param VegetableName the VegetableName to set
     */
    public void setVegetableName(String VegetableName) {
        this.VegetableName = VegetableName;
    }

    /**
     * @return the Unit
     */
    public String getUnit() {
        return Unit;
    }

    /**
     * @param Unit the Unit to set
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * @return the Amount
     */
    public Integer getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    /**
     * @return the Image
     */
    public String getImage() {
        return Image;
    }

    /**
     * @param Image the Image to set
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * @return the Price
     */
    public Double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(Double Price) {
        this.Price = Price;
    }

    /**
     * @return the CatagoryID
     */
    public Integer getCatagoryID() {
        return CategoryID;
    }

    /**
     * @param CatagoryID the CatagoryID to set
     */
    public void setCatagoryID(Integer CatagoryID) {
        this.CategoryID = CatagoryID;
    }
}
