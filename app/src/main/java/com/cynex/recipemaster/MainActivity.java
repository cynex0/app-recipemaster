package com.cynex.recipemaster;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.cynex.recipemaster.RecipeList.RecipeListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

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
                    .replace(R.id.fragment, RecipeListFragment.class, null)
                    .commit();
        }

        bottomNavMenu = findViewById(R.id.bottomNavigationView);
        bottomNavMenu.setBackground(null);
        //addButton = findViewById(R.id.fab);

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
                        .replace(R.id.fragment, fragmentClass, null)
                        .commit();
                return true;
            }
            return false;
        });
    }
}
