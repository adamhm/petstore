package com.codecool.petstore.service;

import com.codecool.petstore.dao.AnimalFoodDao;
import com.codecool.petstore.model.AnimalFood;
import com.codecool.petstore.model.Brand;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class PetStoreService {

    AnimalFoodDao animalFoodDao;

    public PetStoreService(AnimalFoodDao animalFoodDao) {
        this.animalFoodDao = animalFoodDao;
    }

    public List<AnimalFood> getAllFoodByBrand(Brand brand) {
        return animalFoodDao.findByBrand(brand);
    }

    public List<AnimalFood> findAnimalFoodBeforeExpirationDate(int delay) {
        List<AnimalFood> allFood = animalFoodDao.findAll();
        Calendar controlDate = Calendar.getInstance();
        controlDate.add(Calendar.DATE, delay);
        return allFood.stream()
                .filter(animalFood -> controlDate.before(animalFood.getExpirationDate()))
                .collect(Collectors.toList());
    }
}
