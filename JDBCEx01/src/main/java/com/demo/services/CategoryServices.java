/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.services;

import com.demo.pojo.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CategoryServices {
    public List<Category> getCases()
    {
        Connection conn = (Connection) DJBCUtils.getConn();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("Select * From category");
        
        List<Category> cates = new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            
            Category c = new Category(id, name);
            cates.add(c);
        }
        cates.forEach(c -> System.out.println(c.getName()));
        conn.close();
}
}