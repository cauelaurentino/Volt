package com.example.volt.repositories;

import com.example.volt.entities.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

// Só de estender JpaRepository, você ganha métodos save(), findAll(), delete() de graça!
public interface AssetRepository extends JpaRepository<Asset, Long> {
}
