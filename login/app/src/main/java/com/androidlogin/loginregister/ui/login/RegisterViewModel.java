package com.androidlogin.loginregister.ui.login;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class RegisterViewModel {



    public ObservableField<String> email = new ObservableField<>("");
    public ObservableField<String> nome = new ObservableField<>("");
    public ObservableField<String> password = new ObservableField<>("");
    public ObservableField<String> confirmPassword = new ObservableField<>("");

    // adicionar validação em tempo real


    public void onRegisterClick(){

        String mEmail = email.get();
        String mNome = nome.get();
        String mPassword = password.get();
        String mConfirmPassword = confirmPassword.get();



    }

}