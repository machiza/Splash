package mz.co.malambe.splash;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Top100 extends AppCompatActivity {
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top100);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        appBarLayout = (AppBarLayout)findViewById(R.id.appBarLayout);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new HipHop(), "HipHop");
        adapter.addFragment(new Marabenta(), "Marabenta");
        adapter.addFragment(new Pandza(), "Pandza");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void btnBackOnClick(View v){
        Intent intent = new Intent(Top100.this,User_Interface.class);
        startActivity(intent);
    }
}
