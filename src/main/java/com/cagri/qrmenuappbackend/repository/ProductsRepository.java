package com.cagri.qrmenuappbackend.repository;

import com.cagri.qrmenuappbackend.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products,Long> {
    List<Products> getProductByCategoryId(Long categoryId);
}