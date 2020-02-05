package com.example.navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
   getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new homeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    Fragment selectfragment=null;
                    switch ((menuItem.getItemId())){
                        case R.id.home:
                            selectfragment=new homeFragment();
                            break;
                        case R.id.mail:
                            selectfragment=new mailFragment();
                            break;
                        case R.id.music:
                            selectfragment=new musicFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selectfragment).commit();
                    return true;
                }
            };
}
