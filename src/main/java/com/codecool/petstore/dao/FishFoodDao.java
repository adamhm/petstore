package com.codecool.petstore.dao;

import com.codecool.petstore.model.Brand;
import com.codecool.petstore.model.FishFood;

import java.util.List;
import java.util.Optional;

public interface FishFoodDao extends AnimalFoodDao {

    public List<FishFood> findAllFishFoodByBrand(Brand brand);

    public Optional<FishFood> save(FishFood fishFood);

    public boolean update(FishFood fishFood);

    public void delete(FishFood fishFood);
}
