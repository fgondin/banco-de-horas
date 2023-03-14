/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bancodehoras.DAO;

import br.com.bancodehoras.DTO.HoraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Frederico
 */
public class horaDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<HoraDTO> lista = new ArrayList<>();
    
    public void AdicionarUsuario(HoraDTO horaDTO) throws ClassNotFoundException{
        String sql = "INSERT INTO horas_db (horas) VALUES (?)";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
                pstm = conn.prepareStatement(sql);
                pstm.setFloat(1, horaDTO.getHoras());
                pstm.execute();
                pstm.close();
        } catch(SQLException e){
            
        }
    }
    
    public ArrayList<HoraDTO> PesquisarUsuario() throws ClassNotFoundException{
        String sql = "SELECT * FROM hora";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
           pstm = conn.prepareStatement(sql);
           rs = pstm.executeQuery(sql);
           
           for(int i=0; rs.next(); i++){
               HoraDTO usuarioDTO = new HoraDTO();
               usuarioDTO.setHoras(rs.getFloat("horas"));
               
               lista.add(usuarioDTO);
           }
           while (rs.next()){
               HoraDTO horaDTO = new HoraDTO();
               horaDTO.setHoras(rs.getFloat("horas"));
               
               lista.add(horaDTO);
           }
           pstm.close();
           
        }catch(SQLException e){
            
        }
        return lista;
    }
    
    public void ExcluirUsuario(HoraDTO horaDTO) throws ClassNotFoundException{
        String sql = "DELETE FROM hora WHERE id = ?";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, horaDTO.getHoras());
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            System.out.println("Nada foi alterado.");
        }
    }
}
