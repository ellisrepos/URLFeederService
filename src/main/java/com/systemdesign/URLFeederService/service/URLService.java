package com.systemdesign.URLFeederService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemdesign.URLFeederService.repository.UrlRepository;
import com.systemdesign.URLFeederService.model.URL;

@Service
public class URLService {
    @Autowired
    private UrlRepository urlRepository;
    
    public void save(URL url) {
        urlRepository.save(url);
    }
}
