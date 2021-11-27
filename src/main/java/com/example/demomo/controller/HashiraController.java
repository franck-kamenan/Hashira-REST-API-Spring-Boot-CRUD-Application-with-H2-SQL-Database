package com.example.demomo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demomo.entity.Hashira;
import com.example.demomo.service.HashiraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HashiraController {
    
    @Autowired
    private HashiraService hashiraService;

    // Create 1 Hashira
    @PostMapping("/hashira")
    public Hashira createHashira(@RequestBody Hashira hashira) {
        
        return hashiraService.createHashira(hashira);
    }
    
    // Create Multiple Hashira
    @PostMapping("/hashiras")
    public List<Hashira> createMultipleHashira(@RequestBody List<Hashira> multipleHashira) {
        
        return hashiraService.createMultipleHashira(multipleHashira);
    }
    
    // Read or Retrieve 1 Hashira by id
    @GetMapping("/hashira/{id}")
    public Optional<Hashira> findHashiraById(@PathVariable int id) {
        
        return hashiraService.findHashiraById(id);
    }
    
    // Read or Retrieve All Hashiras
    @GetMapping("/hashiras")
    public List<Hashira> findAllHashiras() {
        
        return hashiraService.findAllHashiras();
    }
    
    // Update 1 Hashira by id
    @PutMapping("/hashira")
    public Hashira updateHashiraById(@RequestBody Hashira hashira) {
        
        return hashiraService.updateHashiraById(hashira);
    }
    
    // Delete 1 Hashira by id
    @DeleteMapping("/hashira/{id}")
    public void deleteHashiraById(@PathVariable int id) {
        
        hashiraService.deleteHashiraById(id);
    }
}