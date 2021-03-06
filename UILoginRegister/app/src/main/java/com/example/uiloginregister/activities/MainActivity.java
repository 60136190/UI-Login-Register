package com.example.uiloginregister.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import com.example.uiloginregister.R;
import com.example.uiloginregister.fragment.CartFragment;
import com.example.uiloginregister.fragment.HomeFragment;
import com.example.uiloginregister.fragment.InfoFragment;
import com.example.uiloginregister.fragment.MenuFragment;
import com.example.uiloginregister.fragment.MessageFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    private ViewPager mviewPager;
    private ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chipNavigationBar = findViewById(R.id.bottom_nav_bar);
        chipNavigationBar.setItemSelected(R.id.home,
                true);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,
                        new HomeFragment()).commit();
        bottomMenu();
    }

    private void bottomMenu() {
        chipNavigationBar.setOnItemSelectedListener
                (new ChipNavigationBar.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(int i) {
                        Fragment fragment = null;
                        switch (i) {
                            case R.id.home:
                                fragment = new HomeFragment();
                                break;
                            case R.id.menu:
                                fragment = new MenuFragment();
                                break;
                            case R.id.cart:
                                fragment = new CartFragment();
                                break;
                            case R.id.message:
                                fragment = new MessageFragment();
                                break;
                            case R.id.info:
                                fragment = new InfoFragment();
                                break;
                        }
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container,
                                        fragment).commit();
                    }
                });
    }

}

