/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.moirottoeic.WebSaleManagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.moirottoeic.WebSaleManagement.entity.*;
import com.moirottoeic.WebSaleManagement.repository.VegetableRepository;
import com.moirottoeic.WebSaleManagement.service.VegetableService;
import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Admin
 */
@Controller
public class CartController {
    @Autowired
    private VegetableService vegetableService;
    @RequestMapping("/cart")
    public String page(HttpServletRequest request,HttpServletResponse response,Model model) {
        HttpSession session = request.getSession();
        ArrayList<Cart> listCart =  new ArrayList<Cart>();
        if(session.getAttribute("cart")!=null){
            listCart = (ArrayList<Cart>) session.getAttribute("cart");
        }
        Double total = 0.0;
        for (Iterator<Cart> iterator = listCart.iterator(); iterator.hasNext();) {
            Cart next = iterator.next();
            total+=next.getPrice()*next.getQuantity();
        }
        model.addAttribute("cart", listCart);
        model.addAttribute("total", total);

        return "shoping-cart";
    }
    @PostMapping("/addtocart")
    public String addToCart(HttpServletRequest request,HttpServletResponse response) throws IOException{
        HttpSession session = request.getSession();
        ArrayList<Cart> listCart =  new ArrayList<Cart>();
        // get list cart session
        if(session.getAttribute("cart")!=null){
            listCart = (ArrayList<Cart>) session.getAttribute("cart");
        }
        //get parameter tu form
        Integer vegetableID = Integer.parseInt(request.getParameter("id"));
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        // add product vao cart
        Vegetable vegetable = vegetable = vegetableService.getVegetableById(vegetableID);
        boolean isEsxist = false;
        for (Iterator<Cart> iterator = listCart.iterator(); iterator.hasNext();) {
            Cart next = iterator.next();
            if(next.getVegetableID().equals(vegetableID)){
                isEsxist = true;
                next.setQuantity(next.getQuantity()+quantity);
                break;
            }
        }
        if(!isEsxist){
            Cart cart = new Cart();
            cart.setVegetableID(vegetableID);
            cart.setImage(vegetable.getImage());
            cart.setVegetableName(vegetable.getVegetableName());
            cart.setPrice(vegetable.getPrice());
            cart.setQuantity(quantity);
            listCart.add(cart);
            session.setAttribute("cart", listCart);
        }
       //session.removeAttribute("cart");
       return "redirect:/cart";
    }
    @PostMapping("/removecart")
    public String removeCart(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        ArrayList<Cart> listCart =  new ArrayList<Cart>();
        if(session.getAttribute("cart")!=null){
            listCart = (ArrayList<Cart>) session.getAttribute("cart");
        }
        Integer vegetableID = Integer.parseInt(request.getParameter("id"));
        for (Iterator<Cart> iterator = listCart.iterator(); iterator.hasNext();) {
            Cart next = iterator.next();
            if(next.getVegetableID().equals(vegetableID)){
                listCart.remove(next);
                break;
            }
        }
        return "redirect:/cart";
    }
}
