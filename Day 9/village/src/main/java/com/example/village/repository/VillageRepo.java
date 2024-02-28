package com.example.village.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.village.model.Village;

public interface VillageRepo extends CrudRepository<Village, Integer> {

    Village findByVillageName(String villageName);

    Village findByVillagePopulation(int villagePopulation);
}