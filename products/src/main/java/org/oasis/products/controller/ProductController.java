package org.oasis.products.controller;


import org.oasis.products.entity.Product;
import org.oasis.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/products")
@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostMapping(value = "/addProduct")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.addProduct(product)) ;
    }

    @GetMapping(value = "/getProduct/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable Long productId){
        if(productService.getProduct(productId) != null){
            return  ResponseEntity.ok(productService.getProduct(productId));
        }
        else{
            return  ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(value = "/getAllProducts")
    public ResponseEntity<Iterable<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @DeleteMapping(value = "/deleteProduct/{productId}")
    public ResponseEntity deleteProduct(@PathVariable Long productId){
          productService.deleteProduct(productId);
          return ResponseEntity.noContent().build();
    }


}
