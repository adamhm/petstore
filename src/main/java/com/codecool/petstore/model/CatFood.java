package com.codecool.petstore.model;

import java.util.Date;

public class CatFood extends AnimalFood {
    public CatFood(long id, String name, Brand brand, AnimalFoodType type, Date expirationDate) {
        super(id, name, brand, type, expirationDate);
    }
}
