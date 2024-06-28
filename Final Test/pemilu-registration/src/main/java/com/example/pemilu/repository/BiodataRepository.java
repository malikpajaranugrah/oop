package com.example.pemilu.repository;

import com.example.pemilu.model.Biodata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiodataRepository extends JpaRepository<Biodata, Long> {
    boolean existsByNik(String nik);
}
