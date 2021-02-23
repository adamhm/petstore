package com.codecool.petstore.dao;

import com.codecool.petstore.model.Brand;
import com.codecool.petstore.model.CatFood;

import java.util.List;
import java.util.Optional;

public interface CatFoodDao extends AnimalFoodDao {

    public List<CatFood> findAllCatFoodByBrand(Brand brand);

    public Optional<CatFood> save(CatFood catFood);

    public boolean update(CatFood catFood);

    public void delete(CatFood catFood);
}
