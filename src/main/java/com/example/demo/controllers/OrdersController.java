/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.models.Orders;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Cezar
 */
@Controller
public class OrdersController {
   /* 
     @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private OrdersRepository OrdersRepository;

    @RequestMapping("/users")
    String products() throws ParseException {
        SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateformat3.parse("05/07/2017");

        OrdersRepository.save(new Orders(1, 1, 120, date1));

        return "users";
    }*/
    
}
