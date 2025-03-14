package com.devrodts.products.products.presentation.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.UUID;



public record CreateProductDTO(

        @NotBlank(message = "The id should be filled.")
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        UUID productId,

        @NotBlank(message = "The name should be filled.")
        String name,

        @NotBlank(message = "The price should be filled")
        @Min(value = 0, message = "The price should be greater than or equal to zero.")
        BigDecimal price,
        @NotBlank(message = "The stock cant be empty.") int stock,

        @NotBlank(message = "The image cant be empty.")
        String image,

        @NotBlank(message = "The category cant be empty.")
        String category
){}
