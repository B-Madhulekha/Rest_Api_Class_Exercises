package com.example.recipe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.recipe.model.Recipe;

public interface RecipeRepo extends CrudRepository<Recipe, Integer> {

    List<Recipe> findByRecipeName(String recipeName);
}