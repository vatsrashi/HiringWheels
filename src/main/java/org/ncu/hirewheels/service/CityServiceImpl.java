package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.city;
import org.ncu.hirewheels.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public city addCity(city city) {
        return cityRepository.save(city);
    }

    @Override
    public city getCityById(Integer cityId) {
        return cityRepository.findById(cityId).orElse(null);
    }

    @Override
    public city updateCity(Integer cityId, city updatedCity) {
        if (cityRepository.existsById(cityId)) {
        	city existingCity = cityRepository.getById(cityId);

            // Update the fields of the existing city with the values from updatedCity
            existingCity.setCityName(updatedCity.getCityName());

            // Save the updated city
            return cityRepository.save(existingCity);
        }
        return null;
    }

    @Override
    public void deleteCity(Integer cityId) {
        cityRepository.deleteById(cityId);
    }

}
