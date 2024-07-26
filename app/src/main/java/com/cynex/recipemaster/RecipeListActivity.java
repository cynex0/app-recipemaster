package com.cynex.recipemaster;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RecipeListActivity extends AppCompatActivity {
    BottomNavigationView bottomNavMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_list);

        bottomNavMenu = findViewById(R.id.bottomNavigationView);
        bottomNavMenu.setBackground(null);
    }
}
