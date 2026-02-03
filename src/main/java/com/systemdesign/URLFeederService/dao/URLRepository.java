package com.systemdesign.URLFeederService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systemdesign.URLFeederService.model.URL;

public interface URLRepository extends JpaRepository<URL, String> {

}
