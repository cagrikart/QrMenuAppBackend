package com.cagri.qrmenuappbackend.services.abstracts;

import java.util.List;

import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.dto.ProductCategoryRequest;
import com.cagri.qrmenuappbackend.dto.ProductUpdateRequest;
import com.cagri.qrmenuappbackend.entities.Products;

public interface ProductsService {
    DataResult<List<Products>> getListProducts();
    Result addProducts(ProductCategoryRequest productCategoryRequest);

    Result updateProducts(ProductUpdateRequest productUpdateRequest, Long productId);

    //DataResult<List<GetProductByCategory>> getProductsByCategory(Long categoryId);

}