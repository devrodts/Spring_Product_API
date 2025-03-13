package com.devrodts.products.products.infra.persistence;
import com.devrodts.products.products.domain.models.ProductModel;
import com.devrodts.products.products.infra.repository.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductJpaRepository extends JpaRepository<ProductModel, Long>, ProductRepository {

    @Override
    default Optional<ProductModel> findById(Long id) {
        return findById(id);
    }

    @Override
    default List<ProductModel> findAll() {
        return findAll();
    }

    @Override
    default ProductModel save(ProductModel product) {
        return save(product);
    }

    @Override
    default void deleteById(Long id) {
        deleteById(id);
    }
}
