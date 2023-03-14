/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bancodehoras.DTO;

/**
 *
 * @author Frederico
 */
public class UsuarioDTO {
     private int usuarioId;
    private String nome;
    private String email;
    private String senha;
    
    public int getUsuarioId(){
        return usuarioId;
    }
    
    public void setUsuarioId(int funcionarioId){
        this.usuarioId = funcionarioId;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
