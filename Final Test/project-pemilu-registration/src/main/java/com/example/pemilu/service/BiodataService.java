package com.example.pemilu.service;

import com.example.pemilu.model.Biodata;
import com.example.pemilu.repository.BiodataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiodataService {
    @Autowired
    private BiodataRepository biodataRepository;

    private Biodata temporaryBiodata;

    public Biodata saveBiodata(Biodata biodata) {
        return biodataRepository.save(biodata);
    }

    public boolean isNikExist(String nik) {
        return biodataRepository.existsByNik(nik);
    }

    public void setTemporaryBiodata(Biodata biodata) {
        this.temporaryBiodata = biodata;
    }

    public Biodata getTemporaryBiodata() {
        return this.temporaryBiodata;
    }
}
