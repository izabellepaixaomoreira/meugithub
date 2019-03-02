package com.androidlogin.loginregister.ui.login;


import android.databinding.ObservableBoolean;
import android.os.Handler;

import android.databinding.ObservableField;

public class LoginViewModel {

    public ObservableField<String> email = new ObservableField<>("");
    public ObservableField<String> password = new ObservableField<>("");
    public ObservableBoolean loadingState = new ObservableBoolean();
    public ObservableBoolean isLoginDone = new ObservableBoolean();
    // adicionar validação em tempo real

    onLoginClick()
    public void {

        String mEmail = email.get();
        String mPassword = password.get();

        if (mEmail.equals("") || mPassword.equals("")){
            return;
        }


        // inicia o loading
        loadingState.set(true);

        // simula um delay de 1,5 segundo
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingState.set(false);
                isLoginDone.set(true);
            }
        },1500);


    }

    }


