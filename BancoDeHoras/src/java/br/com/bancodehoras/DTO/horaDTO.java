/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bancodehoras.DTO;

/**
 *
 * @author Frederico
 */
public class HoraDTO {
    private int horaId;
    private String hora_devendo;
    private String hora_extra;
    
    public int getHoraId(){
        return horaId;
    }
    
    public void setHoraId(int horaId){
        this.horaId = horaId;
    }
    
    public String getHora_devendo(){
        return hora_devendo;
    }
    
    public void setHora_devendo(String hora_devendo){
        this.hora_devendo = hora_devendo;
    }
    
    public String getHora_extra(){
        return hora_extra;
    }
    
    public void setHora_extra(String hora_extra){
        this.hora_extra = hora_extra;
    }
}
