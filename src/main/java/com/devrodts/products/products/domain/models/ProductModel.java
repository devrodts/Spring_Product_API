package com.devrodts.products.products.domain.models;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor

public class ProductModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private UUID productId;

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    @NotBlank
    @Size(min = 1)
    private Double price;

    @NotBlank
    @Size(min = 0)
    private int stock;

    @NotBlank
    private String description;

    @NotBlank
    private String image;

    @NotBlank
    private String category;

    @ManyToMany(mappedBy = "orders")
    private List<OrderModel> orders;
}
