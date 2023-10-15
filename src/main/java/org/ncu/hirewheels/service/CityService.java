package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.city;

public interface CityService {
    city addCity(city city);
    city getCityById(Integer cityId);
    city updateCity(Integer cityId, city updatedCity);
    void deleteCity(Integer cityId);
}
