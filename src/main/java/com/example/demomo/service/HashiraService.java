package com.example.demomo.service;

import java.util.List;
import java.util.Optional;

import com.example.demomo.entity.Hashira;
import com.example.demomo.repository.HashiraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HashiraService {
    
    @Autowired
    private HashiraRepository hashiraRepository;

    // Create 1 Hashira
    public Hashira createHashira(Hashira hashira) {
        
        return hashiraRepository.save(hashira);
    }

    // Create Multiple Hashira
    public List<Hashira> createMultipleHashira(List<Hashira> multipleHashira) {
        
        return hashiraRepository.saveAll(multipleHashira);
    }

    // Read or Retrieve 1 Hashira by id
    public Optional<Hashira> findHashiraById(int id) {
        
        return hashiraRepository.findById(id);
    }

    // Read or Retrieve All Hashiras
    public List<Hashira> findAllHashiras() {
        
        return hashiraRepository.findAll();
    }

    // Update 1 Hashira by id
    public Hashira updateHashiraById(Hashira hashira) {
        
        Hashira toBeupdatedHashira = null;
        if (hashiraRepository.findById(hashira.getId()).isPresent()) {

            toBeupdatedHashira = hashiraRepository.findById(hashira.getId()).get();
            toBeupdatedHashira.setName(hashira.getName());
            toBeupdatedHashira.setBreathingStyle(hashira.getBreathingStyle());
            toBeupdatedHashira.setDemonSlayerMark(hashira.getDemonSlayerMark());
            toBeupdatedHashira.setBrightRedNichirinSword(hashira.getBrightRedNichirinSword());
            toBeupdatedHashira.setTransparentWorld(hashira.getTransparentWorld());
            hashiraRepository.save(toBeupdatedHashira);
        } else {

            return new Hashira();
        }

        return toBeupdatedHashira;
    }

    // Delete 1 Hashira by id
    public void deleteHashiraById(int id) {
        
        hashiraRepository.deleteById(id);
    }
}