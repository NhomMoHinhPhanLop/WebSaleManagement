/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.repository;
import com.moirottoeic.WebSaleManagement.entity.Vegetable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface VegetableRepository extends CrudRepository<Vegetable, Integer> {

}
