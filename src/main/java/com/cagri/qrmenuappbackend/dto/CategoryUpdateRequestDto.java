package com.cagri.qrmenuappbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CategoryUpdateRequestDto {
    private Long categoryId;
    private String categoryName;
}
