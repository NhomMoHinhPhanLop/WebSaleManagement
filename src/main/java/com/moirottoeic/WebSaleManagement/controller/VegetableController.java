/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.controller;

import com.moirottoeic.WebSaleManagement.entity.*;
import com.moirottoeic.WebSaleManagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Admin
 */
@Controller
public class VegetableController {
    @Autowired
    private VegetableRepository vegetableRepository;
    @GetMapping("/all")
    public String getAll(Model m){
        Iterable<Vegetable> list = vegetableRepository.findAll();
        m.addAttribute("data", list);
        return "main";
    }
}