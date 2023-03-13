/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bancodehoras.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Frederico
 */
public class conexaoDAO {
    public Connection conexaoBD() throws ClassNotFoundException {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/biblioteca_db?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("não conectou");
        }
        return conn;
    }
    
}
