package com.example.sprintsecurityapp.services;

import com.example.sprintsecurityapp.entity.Nodes;
import com.example.sprintsecurityapp.repo.SecureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecureService {
    @Autowired
    private SecureRepository secureRepository;

    public Iterable<Nodes> getAllSecurity(){
        return secureRepository.findAll();
    }
}
