package com.example.pemilu.service;

import com.example.pemilu.model.Biodata;
import com.example.pemilu.repository.BiodataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiodataService {
    @Autowired
    private BiodataRepository biodataRepository;

    public Biodata saveBiodata(Biodata biodata) {
        return biodataRepository.save(biodata);
    }

    public boolean isNikExist(String nik) {
        return biodataRepository.existsByNik(nik);
    }
}
