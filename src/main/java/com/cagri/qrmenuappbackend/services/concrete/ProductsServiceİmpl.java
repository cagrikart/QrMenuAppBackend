package com.cagri.qrmenuappbackend.services.concrete;


import com.cagri.qrmenuappbackend.core.utilities.results.DataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.Result;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessDataResult;
import com.cagri.qrmenuappbackend.core.utilities.results.SuccessResult;
import com.cagri.qrmenuappbackend.dto.ProductCategoryRequest;
import com.cagri.qrmenuappbackend.dto.ProductUpdateRequest;
import com.cagri.qrmenuappbackend.entities.Category;
import com.cagri.qrmenuappbackend.entities.Products;
import com.cagri.qrmenuappbackend.repository.CategoryRepository;
import com.cagri.qrmenuappbackend.repository.ProductsRepository;
import com.cagri.qrmenuappbackend.services.abstracts.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductsServiceİmpl implements ProductsService {

    private  final ProductsRepository productsRepository;
    private final CategoryRepository categoryRepository;
    @Override
    public DataResult<List<Products>> getListProducts() {
        return new SuccessDataResult<List<Products>>(this.productsRepository.findAll(),"products listed");
    }

    @Override
    public Result addProducts (ProductCategoryRequest productCategoryRequest) {
        Products products = new Products();
        Optional<Category> categoryOptional = this.categoryRepository.findById(productCategoryRequest.getCategoryId());
        if (categoryOptional.isPresent()) {
            Category categoryDb = categoryOptional.get();
            products.setName(productCategoryRequest.getName());
            products.setPrice(productCategoryRequest.getPrice());
            products.setCategory(categoryDb);
            this.productsRepository.save(products);
        }

        return new SuccessResult("products added");
    }

    @Override
    public Result updateProducts(ProductUpdateRequest productUpdateRequest, Long productId) {
        Optional<Products> productDb=this.productsRepository.findById(productId);
        Category categoryDb = this.categoryRepository.findById(productUpdateRequest.getCategoryId())
                .orElseThrow(()-> new IllegalArgumentException("Category not found"));
        Products products = productDb.get();
        if (productDb.isPresent()) {
            products.setName(productUpdateRequest.getName());
            products.setPrice(productUpdateRequest.getPrice());
            products.setCategory(categoryDb);
            this.productsRepository.save(products);
        }
        return new SuccessResult("güncellendi "+ productId) ;
    }

//   @Override
//   public DataResult<List<Products>> getProductsByCategory(Long categoryId) {
//       return new  SuccessDataResult<List<Products>>(this.productsRepository);
//   }


}
