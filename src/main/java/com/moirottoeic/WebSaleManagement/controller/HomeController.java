/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.controller;

import com.moirottoeic.WebSaleManagement.entity.Category;
import com.moirottoeic.WebSaleManagement.entity.Vegetable;
import com.moirottoeic.WebSaleManagement.repository.CategoryRepository;
import com.moirottoeic.WebSaleManagement.repository.VegetableRepository;
import com.moirottoeic.WebSaleManagement.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class HomeController {
    @Autowired
    private VegetableService vegetableService;
    @Autowired
    private CategoryRepository categoryRepository;
    @RequestMapping("/")
    public String homepage(Model model) {
        Iterable<Vegetable> listVegetables = vegetableService.getLimitVegetables(8);
        Iterable<Category> listCategorys = categoryRepository.findAll();
        model.addAttribute("data", listVegetables);
        model.addAttribute("categorys", listCategorys);
        return "index";
    }
    
}
