package com.store.tropicthunder.controller;

import com.store.tropicthunder.model.Characters;
import com.store.tropicthunder.repository.CharactersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/character")
public class CharactersController {

    @Autowired
    private CharactersRepository charactersRepository;

    @GetMapping
    public List<Characters> getAllCharacters() {
        return charactersRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Characters> getProductById(@PathVariable Long id) {
        Optional<Characters> product = charactersRepository.findById(id);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Characters> createCharacter(@RequestBody Characters characters) {
        Characters savedProduct = charactersRepository.save(characters);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

}