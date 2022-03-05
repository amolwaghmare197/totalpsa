package com.locationweb2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationweb2.entities.Locations;
import com.locationweb2.repositories.LocationRepositories;

@RestController
@RequestMapping("/location")
public class LocationRestController {

	@Autowired
	private LocationRepositories repo;

	@GetMapping
	public List<Locations> listAllLocation() {
		List<Locations> loc = repo.findAll();
		return loc;

	}
}
