/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dita.dev.swingmvpimplementation.Model;

/**
 *
 * @author brian-kamau
 */
public class User implements UserModel{
    String user;
    
    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }
    
}
