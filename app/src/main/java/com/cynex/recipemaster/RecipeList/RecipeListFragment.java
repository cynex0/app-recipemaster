package com.cynex.recipemaster.RecipeList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cynex.recipemaster.R;
import com.google.android.material.divider.MaterialDividerItemDecoration;

import java.util.ArrayList;

public class RecipeListFragment extends Fragment {
    private ArrayList<Recipe> recipes;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recipes = new ArrayList<>();
        recipes.add(new Recipe("Spaghetti", "Italian", null, null, null));
        recipes.add(new Recipe("Lasagne", "Italian", null, null, null));
        recipes.add(new Recipe("Risotto", "Italian", null, null, null));
        recipes.add(new Recipe("Pizza", "Italian", null, null, null));
        recipes.add(new Recipe("Steak", "American", null, null, null));
        recipes.add(new Recipe("Chicken", "American", null, null, null));
        recipes.add(new Recipe("Sushi", "Japanese", null, null, null));
        recipes.add(new Recipe("Ramen", "Japanese", null, null, null));
        recipes.add(new Recipe("Tacos", "Mexican", null, null, null));
        recipes.add(new Recipe("Burritos", "Mexican", null, null, null));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recipe_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.addItemDecoration(new MaterialDividerItemDecoration(recyclerView.getContext(), layoutManager.getOrientation()));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new RecipeListRecyclerAdapter(view.getContext(), recipes));
        return view;
    }
}
