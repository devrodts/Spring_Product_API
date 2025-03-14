//package com.devrodts.products.products.application.usecases;
//
//import com.devrodts.products.products.domain.models.ProductModel;
//import com.devrodts.products.products.infra.repository.ProductRepository;
//import com.devrodts.products.products.presentation.dtos.CreateProductDTO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class ProductCreateUseCase {
//
//    private final ProductRepository productRepository;
//
//    public ProductModel execute(CreateProductDTO dto) {
//        ProductModel product = new ProductModel(null, dto.name(), dto.description(), dto.price());
//        return productRepository.save(product);
//    }
//}
