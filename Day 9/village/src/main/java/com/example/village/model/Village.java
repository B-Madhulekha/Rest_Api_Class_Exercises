package com.example.village.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Village {
    @Id
    private int villageId;
    private String villageName;
    private int numOfMen;
    private int numOfWomen;
    private int villagePopulation;
    private int numOfSchools;

    public Village() {
    }

    public Village(int villageId, String villageName, int numOfMen, int numOfWomen, int villagePopulation, int numOfSchools) {
        this.villageId = villageId;
        this.villageName = villageName;
        this.numOfMen = numOfMen;
        this.numOfWomen = numOfWomen;
        this.villagePopulation = villagePopulation;
        this.numOfSchools = numOfSchools;
    }

    // Add getters and setters
}