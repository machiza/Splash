package mz.co.malambe.splash;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Music extends AppCompatActivity {
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        appBarLayout = (AppBarLayout)findViewById(R.id.appBarLayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new MusicHipHop(), "HipHop");
        adapter.addFragment(new MusicMarrabenta(), "Marabenta");
        adapter.addFragment(new MusicPandza(), "Pandza");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void btnBackOnClick(View v){
        Intent intent = new Intent(Music.this,User_Interface.class);
        startActivity(intent);
    }
}
