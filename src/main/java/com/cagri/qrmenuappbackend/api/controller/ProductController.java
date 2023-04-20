package com.cagri.qrmenuappbackend.api.controller;


import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessDataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessResult;
import com.cagri.qrmenuappbackend.dto.GetProductByCategory;
import com.cagri.qrmenuappbackend.dto.ProductCategoryRequest;
import com.cagri.qrmenuappbackend.dto.ProductUpdateRequest;
import com.cagri.qrmenuappbackend.entities.Category;
import com.cagri.qrmenuappbackend.entities.Products;
import com.cagri.qrmenuappbackend.services.abstracts.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/product")
@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/getProducts")
    public DataResult<List<Products>> getListProducts() {
        return this.productsService.getListProducts();
    }

//    @GetMapping("/getProductsByCategory")
//    public DataResult<List<GetProductByCategory>> getProductsByCategory(@RequestParam("categoryId") Long categoryId) {
//        return this.productsService.getProductsByCategory(categoryId);
//    }

    @PostMapping("/addProducts")
    public Result addProducts (@RequestBody  ProductCategoryRequest productCategoryRequest) {
        System.out.println(productCategoryRequest.toString());
        return this.productsService.addProducts(productCategoryRequest);
    }

    @PostMapping("updateProducts")
    public Result updateProducts(@RequestBody ProductUpdateRequest productUpdateRequest, @RequestParam Long productId) {
        return this.productsService.updateProducts(productUpdateRequest,productId);
    }

}
