/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Garnspring.model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Garnet
 */
@RestController
public class My { 
    @GetMapping("/")
    public String saveDistrict() {
       
        return "Saved Successfully";

    }
    @GetMapping("")
    public String saveistrict() {
       
        return "Saved Successfully";

    }
}
