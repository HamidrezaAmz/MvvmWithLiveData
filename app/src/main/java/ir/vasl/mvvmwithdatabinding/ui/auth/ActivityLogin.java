package ir.vasl.mvvmwithdatabinding.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import ir.vasl.mvvmwithdatabinding.R;
import ir.vasl.mvvmwithdatabinding.databinding.ActivityLoginBinding;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        SimpleViewModel viewModel = ViewModelProviders.of(this).get(SimpleViewModel.class);
        binding.setViewModel(viewModel);
    }
}
