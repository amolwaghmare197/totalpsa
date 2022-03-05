package com.locationweb2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb2.entities.Locations;
import com.locationweb2.repositories.LocationRepositories;
@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepositories repo ;

	@Override
	public void saveLocations(Locations loc) {
		// TODO Auto-generated method stub
		repo.save(loc);

	}

	@Override
	public List<Locations> listlocation() {
		// TODO Auto-generated method stub
		List<Locations> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public void deletById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Locations updateById(Long id) {
		// TODO Auto-generated method stub
		Optional<Locations> findById = repo.findById(id);
		Locations loc = findById.get();
		return loc;
	}

}
