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
@Entity (name = "OrderDetail")
@Table (name = "OrderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Integer OrderID;
    private Integer VegetableID;
    private Integer Quantity;
    private Double Price;

    /**
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * @return the OrderID
     */
    public Integer getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(Integer OrderID) {
        this.OrderID = OrderID;
    }

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
     * @return the Quantity
     */
    public Integer getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
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
    
}
