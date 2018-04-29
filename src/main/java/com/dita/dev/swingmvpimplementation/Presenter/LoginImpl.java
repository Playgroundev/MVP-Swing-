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
public class LoginImpl  implements LoginPresenter{
    UserModel userModel;
    LoginView loginView;
    private Runnable onLogin;

    @Override
    public UserModel getModel() {
        return userModel;
    }

    @Override
    public void setModel(UserModel userModel) {
    this.userModel = userModel;    }
    
    @Override
    public LoginView getView() {
        return loginView;
    }

    @Override
    public void setView(LoginView loginView) {
        this.loginView=loginView;
    }

    @Override
    public void setOnLogin(Runnable onLogin) {
        this.onLogin= onLogin;
    }

    @Override
    public void run() {
        userModel.setUser("previousUser");
        loginView.setPresenter(this);
        loginView.updateViewFromModel();
        loginView.open();
    }

    @Override
    public void login() {
        loginView.updateModelFromView();
        if(userModel.getUser().equalsIgnoreCase("root")){
            loginView.close();
            loginView.setPresenter(null);
            onLogin.run();
        }else{
            loginView.userRejected();
        }
    }
    
}
