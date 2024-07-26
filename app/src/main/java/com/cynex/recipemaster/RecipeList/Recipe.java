package com.cynex.recipemaster.RecipeList;

import android.net.Uri;

public class Recipe {
    private String name;
    private String description;
    private Uri imageURI;

    public Recipe(String name, String description, Uri imageURI) {
        this.name = name;
        this.description = description;
        this.imageURI = imageURI;
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
}
