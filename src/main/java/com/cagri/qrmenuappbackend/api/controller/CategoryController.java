package com.cagri.qrmenuappbackend.api.controller;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessDataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessResult;
import com.cagri.qrmenuappbackend.dto.CategoryUpdateRequestDto;
import com.cagri.qrmenuappbackend.entities.Category;
import com.cagri.qrmenuappbackend.services.abstracts.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getCategory")
    public DataResult<List<Category>> getListCategory() {
        System.out.println("değişik");
        return this.categoryService.getListCategory();
    }

    @PostMapping("addCategory")
    public Result addCategory(@RequestBody Category category) {
        return this.categoryService.addCategory(category);
    }

    @PostMapping("updateCategory")
    public Result updateCategory(@RequestBody  CategoryUpdateRequestDto requestDto, @RequestParam Long categoryId) {
        return this.categoryService.updateCategory(requestDto,categoryId);
    }

    @PostMapping("deleteCategory")
    public Result deleteCategoryById(@RequestParam Long departmentId) {
        return this.categoryService.deleteCategoryById(departmentId);
    }
}
