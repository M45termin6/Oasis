package org.oasis.products.service;


import org.oasis.products.entity.Product;
import org.oasis.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Product getProduct(Long productId){
        return  productRepository.findById(productId).orElse(null);
    }

    public Iterable<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);

    }

}
