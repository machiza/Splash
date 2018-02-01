package mz.co.malambe.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void btnLoginOnClick(View v) {
        Intent LoginIntent = new Intent(SignIn.this, User_Interface.class);
        startActivity(LoginIntent);
    }
}
