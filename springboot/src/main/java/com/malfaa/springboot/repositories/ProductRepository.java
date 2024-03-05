package com.malfaa.springboot.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.malfaa.springboot.models.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
