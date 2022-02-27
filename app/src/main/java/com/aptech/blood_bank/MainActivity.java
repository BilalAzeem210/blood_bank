package com.aptech.blood_bank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Switch;


import com.google.android.material.navigation.NavigationView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    private DrawerLayout drawer;
    private NavigationView navigation;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(Toolbar) findViewById(R.id.toolbar);
        navigation =(NavigationView) findViewById(R.id.navigation);
        drawer =(DrawerLayout) findViewById(R.id.drawer);

        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


            navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    drawer.closeDrawer(GravityCompat.START);
                  Intent intent;
                    switch (item.getItemId()){

                        case R.id.bloodtype:
                            intent = new Intent(getBaseContext(),bloodType.class);
                            startActivity(intent);
                            break;

                        case R.id.feedback:
                            intent = new Intent(getBaseContext(),FeedBack.class);
                            startActivity(intent);
                            break;
                    }


                    return true;
                }
            });
        
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }
}