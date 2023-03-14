/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bancodehoras.DAO;

import br.com.bancodehoras.DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Frederico
 */
public class funcionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    
    public void AdicionarUsuario(FuncionarioDTO funcionarioDTO) throws ClassNotFoundException{
        String sql = "INSERT INTO horas_db (funcao) VALUES (?)";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, funcionarioDTO.getFuncao());
                pstm.execute();
                pstm.close();
        } catch(SQLException e){
            
        }
    }
    
    public ArrayList<FuncionarioDTO> PesquisarUsuario() throws ClassNotFoundException{
        String sql = "SELECT * FROM funcionario";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
           pstm = conn.prepareStatement(sql);
           rs = pstm.executeQuery(sql);
           
           for(int i=0; rs.next(); i++){
               FuncionarioDTO usuarioDTO = new FuncionarioDTO();
               usuarioDTO.setFuncao(rs.getInt("funcao"));
               
               lista.add(usuarioDTO);
           }
           while (rs.next()){
               FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
               funcionarioDTO.setFuncao(rs.getInt("funcao"));
               
               lista.add(funcionarioDTO);
           }
           pstm.close();
           
        }catch(SQLException e){
            
        }
        return lista;
    }
    
    public void ExcluirUsuario(FuncionarioDTO funcionarioDTO) throws ClassNotFoundException{
        String sql = "DELETE FROM hora WHERE id = ?";
        conn = new ConexaoDAO().conexaoBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, funcionarioDTO.getFuncao());
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            System.out.println("Nada foi alterado.");
        }
    }
}
