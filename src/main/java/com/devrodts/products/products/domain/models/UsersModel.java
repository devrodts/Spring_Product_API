package com.devrodts.products.products.domain.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    @NotBlank(message =  "Name is Required.")
    @Size(min = 3, max = 100)
    private String name;

    @NotBlank(message =  "Email is Required.")
    @Email
    private String email;

    @NotBlank(message =  "Password is Required.")
    @Size(min = 6, max = 50)
    private String password;

    @NotBlank(message =  "Password is Required.")
    @Size(min = 6, max = 50)
    private String confirmPassword;


    @NotBlank(message =  "Image is Required.")
    @Size(min = 1, max = 100)
    private String image;

    @OneToMany(mappedBy = "orders")
    private List<OrderModel> orders;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false, updatable = true)
    private LocalDateTime updateAt = LocalDateTime.now();

}
