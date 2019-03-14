/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Garnspring.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Garnet
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String title;
    private String isbn;
    private String publisher; 
 
}
