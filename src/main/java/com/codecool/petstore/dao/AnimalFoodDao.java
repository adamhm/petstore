package com.codecool.petstore.dao;

import com.codecool.petstore.model.AnimalFood;
import com.codecool.petstore.model.AnimalFoodType;
import com.codecool.petstore.model.Brand;

import java.util.List;
import java.util.Optional;

public interface AnimalFoodDao {

    public Optional<AnimalFood> findById(long id);

    public List<AnimalFood> findAnimalFoodOnStock();

    public List<AnimalFood> findByBrand(Brand brand);

    public List<AnimalFood> findByType(AnimalFoodType type);
}
