package com.cagri.qrmenuappbackend.services.abstracts;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.dto.CategoryUpdateRequestDto;
import com.cagri.qrmenuappbackend.entities.Category;

import java.util.List;

public interface CategoryService {
    DataResult<List<Category>> getListCategory();
    Result addCategory(Category category);

    Result updateCategory(CategoryUpdateRequestDto requestDto, Long categoryId);

    Result deleteCategoryById(Long departmentId);


}
