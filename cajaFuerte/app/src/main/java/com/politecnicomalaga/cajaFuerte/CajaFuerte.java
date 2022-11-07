/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.cajaFuerte;

/**
 *
 * @author adriair-school
 */
public class CajaFuerte {
    
    private String password;
 
//#############################################################################
    
    public CajaFuerte(){ //Constructor
        
        password = "0000";
        
    }
    
    public boolean changePassword(String oldPassword, String newPassword){ //Cambio de contraseña
        
        if (oldPassword.equals(password) && newPassword.length() == 4){
            
            password = newPassword;
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
    
    public boolean openBox(String userPassword) { //Abrir caja
        
        return userPassword.equals(password);
        
    }
    
}
