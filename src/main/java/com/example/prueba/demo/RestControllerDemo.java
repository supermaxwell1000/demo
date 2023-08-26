/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author compumar
 */
@RestController
public class RestControllerDemo {
    
   
   @GetMapping(path="/hola",produces=MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<JsonNode> sayHello() throws JsonProcessingException
    {
         //Get data from service layer into entityList.

        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree("{\"id\": \"1010\", \"name\": \"Hola\"}");
        return ResponseEntity.ok(json);
    }
    
}
