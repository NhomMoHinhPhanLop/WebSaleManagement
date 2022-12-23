/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.controller;

import com.moirottoeic.WebSaleManagement.entity.Vegetable;
import com.moirottoeic.WebSaleManagement.service.VegetableService;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class DetailController {
    @Autowired
    private VegetableService vegetableService;
    @RequestMapping("/detail")
    public String page(HttpServletRequest request,HttpServletResponse response,Model model) {
        Integer vegetableID = Integer.parseInt(request.getParameter("id"));
        Vegetable vegetable = vegetableService.getVegetableById(vegetableID);
        model.addAttribute("detail", vegetable);
        return "shop-details";
    }
    
}
