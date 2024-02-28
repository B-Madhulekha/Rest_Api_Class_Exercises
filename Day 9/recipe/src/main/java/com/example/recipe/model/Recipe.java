package com.example.recipe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Recipe {
    @Id
    private int recipeId;
    private String title;
    private String ingredients;
    private String instructions;
    private String recipeName;

    public Recipe() {
    }

    public Recipe(int recipeId, String title, String ingredients, String instructions, String recipeName) {
        this.recipeId = recipeId;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.recipeName = recipeName;
    }

    
}