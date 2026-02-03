package com.systemdesign.URLFeederService;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.systemdesign.URLFeederService.common.Constants;
import com.systemdesign.URLFeederService.model.URL;
import com.systemdesign.URLFeederService.service.URLService;

@RestController
public class URLResource {
    @Autowired
    private URLService urlService;
    
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @PostMapping
    public ResponseEntity<Void> submitUrl(@RequestBody URL url) {
        url.setId(Constants.URL_UUID_PREFIX + UUID.randomUUID().toString());
        urlService.save(url);
        System.out.println("Submitting URL: " + url); // Placeholder for URL submission logic
        return ResponseEntity.ok().build();
    }
}