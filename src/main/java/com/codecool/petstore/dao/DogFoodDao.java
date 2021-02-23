package com.codecool.petstore.dao;

import com.codecool.petstore.model.Brand;
import com.codecool.petstore.model.DogFood;

import java.util.List;
import java.util.Optional;

public interface DogFoodDao extends AnimalFoodDao {

    public List<DogFood> findAll();

    public List<DogFood> findAllDogFoodByBrand(Brand brand);

    public Optional<DogFood> save(DogFood dogFood);

    public boolean update(DogFood dogFood);

    public void delete(DogFood dogFood);
}
