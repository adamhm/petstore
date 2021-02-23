package com.codecool.petstore.model;

import java.util.Date;

public class FishFood extends AnimalFood{
    public FishFood(long id, String name, Brand brand, AnimalFoodType type, Date expirationDate) {
        super(id, name, brand, type, expirationDate);
    }
}
