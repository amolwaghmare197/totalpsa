package com.locationweb2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationweb2.entities.Locations;

public interface LocationRepositories extends JpaRepository<Locations, Long> {

}
