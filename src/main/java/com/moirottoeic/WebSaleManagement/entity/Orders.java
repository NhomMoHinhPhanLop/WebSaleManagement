/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@Entity (name = "Orders")
@Table (name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderID;
    private Integer CustomerID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date;
    private Double Total;
    private String Note;

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
     * @return the Date
     */
    public Date getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(Date Date) {
        this.Date = Date;
    }

    /**
     * @return the Total
     */
    public Double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(Double Total) {
        this.Total = Total;
    }

    /**
     * @return the Note
     */
    public String getNote() {
        return Note;
    }

    /**
     * @param Note the Note to set
     */
    public void setNote(String Note) {
        this.Note = Note;
    }
    
}
