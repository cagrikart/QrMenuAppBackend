package com.cagri.qrmenuappbackend.dto;


import lombok.Data;

@Data
public class ProductCategoryRequest {
    private String name;
    private Double price;
    private Long categoryId;
}
