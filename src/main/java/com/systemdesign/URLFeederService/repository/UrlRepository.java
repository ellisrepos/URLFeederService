package com.systemdesign.URLFeederService.repository;

import com.systemdesign.URLFeederService.model.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<URL, Long> {
}
