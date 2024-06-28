package com.example.pemilu.controller;

import com.example.pemilu.model.Biodata;
import com.example.pemilu.service.BiodataService;
import com.example.pemilu.storage.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/biodata")
public class BiodataController {
    @Autowired
    private BiodataService biodataService;

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping
    public Biodata createBiodata(@RequestBody Biodata biodata) {
        if (biodataService.isNikExist(biodata.getNik())) {
            throw new RuntimeException("NIK sudah dipakai");
        }
        return biodataService.saveBiodata(biodata);
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        fileStorageService.store(file);
        return "File uploaded successfully: " + file.getOriginalFilename();
    }
}
