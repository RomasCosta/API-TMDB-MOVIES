/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.costa.romario.daycode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author romar
 */
@RestController
public class FilmeController {
    
    private RestTemplate restTemplate;

    public FilmeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
