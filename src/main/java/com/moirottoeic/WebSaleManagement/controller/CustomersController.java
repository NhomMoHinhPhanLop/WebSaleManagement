//package com.moirottoeic.WebSaleManagement.controller;
//
//
//import java.util.Objects;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.moirottoeic.WebSaleManagement.entity.Customers;
//import com.moirottoeic.WebSaleManagement.repository.CustomersRepository;
//@Controller
//public class CustomersController {
//		@Autowired
//		private CustomersRepository repo;
//		@GetMapping("/register")
//		public String showFrom(Model model) {
//			model.addAttribute("request", new Customers());
//			return "login";
//		}
//		@PostMapping("/process_register")
//		public String processRegister(Customers customer,HttpSession session) {
//			repo.save(customer);
//			session.setAttribute("message", " Register Sucessfully ...");
//			return "redirect:/register";
//		}
//		
//		@PostMapping("/process_login")
//		public String processLogin(String username, String password) {
//			Customers auth =repo.FindbyUsernameAndPass(username,password);
//			if(Objects.nonNull(auth)) {
//				return "redirect:/";
//			}
//			return "redirect:/register";
//		
//		}
////		
//		
//		
//		
//		
//
//
//}
