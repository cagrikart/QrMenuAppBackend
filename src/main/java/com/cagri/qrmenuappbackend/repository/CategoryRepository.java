package com.cagri.qrmenuappbackend.repository;

import com.cagri.qrmenuappbackend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long > {

}
