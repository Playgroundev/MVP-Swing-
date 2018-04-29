/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dita.dev.swingmvpimplementation.View;

import com.dita.dev.swingmvpimplementation.Presenter.LoginPresenter;

/**
 *
 * @author brian-kamau
 */
public interface LoginView {
    LoginPresenter getPresenter();
    public void setPresenter(LoginPresenter loginPresenter);
    void updateModelFromView();
    void updateViewFromModel();
    void open();
    void close();
    void userRejected();
}
