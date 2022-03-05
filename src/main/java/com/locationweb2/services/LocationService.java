package com.locationweb2.services;

import java.util.List;

import com.locationweb2.entities.Locations;

public interface LocationService {
public void saveLocations(Locations loc);

public List<Locations> listlocation();

public void deletById(Long id);

public Locations updateById(Long id);
}
