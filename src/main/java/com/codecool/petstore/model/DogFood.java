package com.codecool.petstore.model;

import java.util.Date;

public class DogFood extends AnimalFood {
    public DogFood(long id, String name, Brand brand, AnimalFoodType type, Date expirationDate) {
        super(id, name, brand, type, expirationDate);
    }
}
