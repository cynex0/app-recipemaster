package com.cynex.recipemaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavMenu;
    private MenuItem listButton;
    private MenuItem pickerButton;
    private FloatingActionButton addButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragment_container_view, RecipeListFragment.class, null)
                    .commit();
        }

        bottomNavMenu = findViewById(R.id.bottomNavigationView);
        bottomNavMenu.setBackground(null);
        listButton = bottomNavMenu.getMenu().getItem(0);
        pickerButton = bottomNavMenu.getMenu().getItem(2);
        addButton = findViewById(R.id.add_button);


        bottomNavMenu.setOnItemSelectedListener(item -> {
            Class<? extends Fragment> fragmentClass = null;

            int itemId = item.getItemId();
            if (itemId == R.id.list) {
                fragmentClass = RecipeListFragment.class;
            } else if (itemId == R.id.picker) {
                fragmentClass = RecipePickerFragment.class;
            }

            if (fragmentClass != null) {
                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_container_view, fragmentClass, null)
                        .commit();
                return true;
            }
            return false;
        });
    }
}
