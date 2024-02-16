/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.costa.romario.daycode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author romar
 * https://developer.themoviedb.org/docs/authentication-application
 */
@RestController
public class FilmeController {
    
    private final String chaveAPI = "7e5bfe5a363366719815d747052b151b";
    private final String urlTMDB = "https://api.themoviedb.org/3/discover/movie";
    
    private final RestTemplate restTemplate;

    public FilmeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    @GetMapping("/top20")
    public String getTop20Movies(){
        
        ResponseEntity<String> response =
                this.restTemplate.getForEntity(urlTMDB + "?api_key=" + chaveAPI , String.class);

        return response.getBody();
    }
}
