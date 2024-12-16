package com.idat.restserver.repository;

import com.idat.restserver.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, Long> {
    Countries findByName(String name);
}
