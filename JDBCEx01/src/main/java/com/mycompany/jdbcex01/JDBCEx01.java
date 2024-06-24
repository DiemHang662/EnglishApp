/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jdbcex01;

import com.demo.pojo.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class JDBCEx01 {

   public static void main(String[] args) throws SQLException {
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
