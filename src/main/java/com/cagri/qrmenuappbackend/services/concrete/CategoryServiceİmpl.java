package com.cagri.qrmenuappbackend.services.concrete;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessDataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessResult;
import com.cagri.qrmenuappbackend.dto.CategoryUpdateRequestDto;
import com.cagri.qrmenuappbackend.entities.Category;
import com.cagri.qrmenuappbackend.repository.CategoryRepository;
import com.cagri.qrmenuappbackend.services.abstracts.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceİmpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public DataResult<List<Category>> getListCategory() {
        return new SuccessDataResult<List<Category>>(this.categoryRepository.findAll(),"all category listed");
    }

    @Override
    public Result addCategory( Category category) {
        this.categoryRepository.save(category);
        return new SuccessResult("category  saved");
    }

    @Override
    public Result updateCategory(CategoryUpdateRequestDto requestDto, Long categoryId) {
        Optional<Category> optionalCategory = this.categoryRepository.findById(categoryId);
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            category.setName(requestDto.getCategoryName());
            this.categoryRepository.save(category);
        }
        return new SuccessResult( "Category updated successfully");

    }

    @Override
    public Result deleteCategoryById( Long departmentId) {

        this.categoryRepository.deleteById(departmentId);
        return new SuccessResult(departmentId + " deleted ");

    }
}

