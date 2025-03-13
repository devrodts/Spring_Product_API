package com.devrodts.products.products.infra.repository;
import com.devrodts.products.products.domain.models.ProductModel;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    ProductModel save(ProductModel product);
    Optional<ProductModel> findById(Long id);
    List<ProductModel> findAll();
    void deleteById(Long id);
}
