/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.entity;

/**
 *
 * @author Admin
 */
public class Cart {
    private Integer VegetableID;
    private String VegetableName;
    private Integer Quantity;
    private String Image;
    private Double Price;

    public String getVegetableName() {
        return VegetableName;
    }

    public void setVegetableName(String VegetableName) {
        this.VegetableName = VegetableName;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
    
    public Integer getVegetableID() {
        return VegetableID;
    }

    public void setVegetableID(Integer VegetableID) {
        this.VegetableID = VegetableID;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

}
