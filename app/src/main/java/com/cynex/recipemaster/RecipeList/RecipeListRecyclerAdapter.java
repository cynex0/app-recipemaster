package com.cynex.recipemaster.RecipeList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cynex.recipemaster.R;

import java.util.ArrayList;

public class RecipeListRecyclerAdapter extends RecyclerView.Adapter<RecipeListRecyclerAdapter.RecipeViewHolder> {
    private Context context;
    private ArrayList<Recipe> recipes;

    public RecipeListRecyclerAdapter(Context context, ArrayList<Recipe> recipes) {
        this.context = context;
        this.recipes = recipes;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recipe_list_card, parent, false);
        view.setOnClickListener(l -> {
            Intent intent = new Intent(view.getContext(), RecipeActivity.class);
            view.getContext().startActivity(intent);
        });
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        holder.image.setImageURI(recipes.get(position).getImageURI());
        holder.name.setText(recipes.get(position).getName());
        holder.description.setText(recipes.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public static class RecipeViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        private TextView description;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.recipe_image);
            name = itemView.findViewById(R.id.recipe_name);
            description = itemView.findViewById(R.id.recipe_desc);

        }
    }
}
