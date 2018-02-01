package mz.co.malambe.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSignInOnClick(View v) {
        Intent signInIntent = new Intent(MainActivity.this, SignIn.class);
        startActivity(signInIntent);
    }
}
