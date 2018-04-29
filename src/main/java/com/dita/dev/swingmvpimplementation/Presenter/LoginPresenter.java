/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dita.dev.swingmvpimplementation.Presenter;

import com.dita.dev.swingmvpimplementation.Model.UserModel;
import com.dita.dev.swingmvpimplementation.View.LoginView;

/**
 *
 * @author brian-kamau
 */
public interface LoginPresenter {
    UserModel getModel();
    void setModel(UserModel userModel);
    LoginView getView();
    void setView(LoginView loginView);
    void setOnLogin(Runnable onLogin);
    void run();
    void login();
    
    
}
