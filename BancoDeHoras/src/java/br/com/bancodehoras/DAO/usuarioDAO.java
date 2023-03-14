/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bancodehoras.DAO;

import br.com.bancodehoras.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Frederico
 */
public class UsuarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();
    
    public void AdicionarUsuario(UsuarioDTO usuarioDTO) throws ClassNotFoundException{
        String sql = "INSERT INTO horas_db (nome, email, senha) VALUES (?, ?, ?)";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, usuarioDTO.getNome());
                pstm.setString(2, usuarioDTO.getEmail());
                pstm.setString(3, usuarioDTO.getSenha());
                pstm.execute();
                pstm.close();
        } catch(SQLException e){
            
        }
    }
    
    public ArrayList<UsuarioDTO> PesquisarUsuario() throws ClassNotFoundException{
        String sql = "SELECT * FROM usuario";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
           pstm = conn.prepareStatement(sql);
           rs = pstm.executeQuery(sql);
           
           for(int i=0; rs.next(); i++){
               UsuarioDTO usuarioDTO = new UsuarioDTO();
               usuarioDTO.setUsuarioId(rs.getInt("usuario_id"));
               usuarioDTO.setNome(rs.getString("nome"));
               
               lista.add(usuarioDTO);
           }
           while (rs.next()){
               UsuarioDTO usuarioDTO = new UsuarioDTO();
               usuarioDTO.setUsuarioId(rs.getInt("usuario_id"));
               usuarioDTO.setNome(rs.getString("nome"));
               
               lista.add(usuarioDTO);
           }
           pstm.close();
           
        }catch(SQLException e){
            
        }
        return lista;
    }
}
