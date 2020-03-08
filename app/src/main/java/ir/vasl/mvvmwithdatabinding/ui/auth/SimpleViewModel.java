package ir.vasl.mvvmwithdatabinding.ui.auth;

import android.view.View;

import androidx.lifecycle.ViewModel;

import ir.vasl.mvvmwithdatabinding.Utils.PublicFunctions;

public class SimpleViewModel extends ViewModel {

    String email;
    String password;

    public SimpleViewModel() {
    }

    public SimpleViewModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void onLoginClicked(View view) {

        if (PublicFunctions.isNullOrEmpty(email) || PublicFunctions.isNullOrEmpty(password)) {

            return;
        }


    }

}
