/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author admin
 */
@AllArgsConstructor
@Getter
@Setter
public class Category {
    private int id;
    private String name;
    
    public Category(int is, String name){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
//      public boolean getName(){
//        throw new UnsupportedOperationException("Noy supported yet.");
//    }
    
      
}