package mz.co.malambe.splash;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class User_Interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);
    }

    public void btnTopOnclick(View view) {
        Intent topIntent = new Intent(User_Interface.this, Top100.class);
        startActivity(topIntent);

        ListFragment fragment = new ListFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder, fragment);
        fragmentTransaction.commit();
    }

    public void btnMusicOnClick(View view) {
        Intent musicIntent = new Intent(User_Interface.this, Music.class);
        startActivity(musicIntent);
    }
}
