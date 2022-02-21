/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.jakartaee9.migration.controller;

import com.avbravo.jmoordbutils.JsfUtil;
import jakarta.faces.view.ViewScoped;

import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named(value = "helloController")
@ViewScoped
@Data
public class HelloController implements Serializable {
// <editor-fold defaultstate="collapsed" desc="field">
    private String name;
    private String userName;
    private String password;
    private Boolean loggedIn = Boolean.FALSE;
// </editor-fold>
    /**
     * Creates a new instance of HelloController
     */
    public HelloController() {
    }
    
    // <editor-fold defaultstate="collapsed" desc=" String saludar()">
    public String saludar(){
        JsfUtil.successMessage("Bienvenido "+ name + " a Jakarta EE 9.0");

        return "";
    }
// </editor-fold>
    
    public String authenticate(){
        return "";
    }
    
}
