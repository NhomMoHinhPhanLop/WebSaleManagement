/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.service;

import com.moirottoeic.WebSaleManagement.entity.Vegetable;
import com.moirottoeic.WebSaleManagement.repository.VegetableRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class VegetableService {
    @Autowired
    private VegetableRepository vegetableRepository;
    @PersistenceContext
    private EntityManager entityManager;
    public Iterable<Vegetable> getAll(){
        return vegetableRepository.findAll();
    }
    public List<Vegetable> getLimitVegetables(int limit){
        List<Vegetable>vegetables = new ArrayList<>();
        entityManager.createQuery("FROM Vegetable",
                Vegetable.class).setMaxResults(limit).getResultList()
                .forEach(vegetables::add);
        return vegetables;
    }
    public Vegetable getVegetableById(int id){
        Vegetable vegetable;
        vegetable= vegetableRepository.findById(id).get();
        return vegetable;
    }
}
