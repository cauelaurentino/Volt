package com.example.volt.controllers;

import com.example.volt.entities.Asset;
import com.example.volt.repositories.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ativos") // O endereço será http://localhost:8080/ativos
@CrossOrigin("*") // IMPORTANTE: Permite que o React (porta 3000) acesse o Java (porta 8080)
public class AssetController {

    @Autowired // Injeta o repositório aqui
    private AssetRepository repository;

    @GetMapping // Quando o React fizer um GET
    public List<Asset> listarTodos() {
        return repository.findAll();
    }

    @PostMapping // Quando o React fizer um POST (Salvar)
    public Asset salvar(@RequestBody Asset asset) {
        return repository.save(asset);
    }
}