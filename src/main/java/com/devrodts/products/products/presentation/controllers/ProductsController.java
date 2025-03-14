package com.devrodts.products.products.presentation.controllers;

import com.devrodts.products.products.application.usecases.ProductCreateUseCase;
import com.devrodts.products.products.presentation.dtos.CreateProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductCreateUseCase createProductUseCase;

    @PostMapping
    public ResponseEntity<Void> createProduct(@RequestBody CreateProductDTO createProductDTO) {
        try {
            createProductUseCase.execute(createProductDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            throw new RuntimeException("Error creating product", e);
        }
    }

    @GetMapping
    public ResponseEntity<Void> getProducts() {
        try {
            return ResponseEntity.ok().build();
        }catch (Exception e) {
                throw new RuntimeException("Error getting products", e);
        }
    }
}
