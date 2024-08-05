package com.cynex.recipemaster.RecipeList;

import android.net.Uri;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private String description;
    private Uri imageURI;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> instructions;

    public Recipe(String name, String description, Uri imageURI, ArrayList<Ingredient> ingredients, ArrayList<String> instructions) {
        this.name = name;
        this.description = description;
        this.imageURI = imageURI;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Uri getImageURI() {
        return imageURI;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static class Ingredient {
        String name;
        int amount;
        String unit;

        public Ingredient(String name, int amount, String unit) {
            this.name = name;
            this.amount = amount;
            this.unit = unit;
        }
    }
}
