/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bancodehoras.DTO;

/**
 *
 * @author Frederico
 */
public class FuncionarioDTO {
   private int funcionarioId;
   private int funcao;
   
   public int getFuncionarioId(){
       return funcionarioId;
   }
   
   public void setFuncionarioId(int funcionarioId){
       this.funcionarioId = funcionarioId;
   }
   
   public int getFuncao(){
       return funcao;
   }
   
   public void setFuncao(int funcao){
       this.funcao = funcao;
   }
   
}