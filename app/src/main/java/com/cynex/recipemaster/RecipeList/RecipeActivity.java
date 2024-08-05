package com.cynex.recipemaster.RecipeList;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cynex.recipemaster.R;

public class RecipeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);
        ImageView image = findViewById(R.id.header_image);
        image.setImageResource(R.drawable.ic_launcher_background);
    }
}
