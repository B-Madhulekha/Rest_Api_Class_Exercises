package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepo;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(int productId, Product product) {
        if (productRepo.existsById(productId)) {
            product.setProductId(productId);
            return productRepo.save(product);
        } else {
            return null;
        }
    }

    public Product deleteProduct(int productId) {
        Product deletedProduct = productRepo.findById(productId).orElse(null);
        if (deletedProduct != null) {
            productRepo.deleteById(productId);
        }
        return deletedProduct;
    }
}
