package org.oasis.cart.controller;


import org.oasis.cart.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.oasis.cart.service.CartService;

@RequestMapping(value = "/cart")
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping(value = "/createCart")
    public ResponseEntity<Cart> createCart(@RequestBody Cart cart){
        return ResponseEntity.ok(cartService.addCart(cart)) ;
    }

    @GetMapping(value = "/getCart/{cartId}")
    public ResponseEntity<Cart> getCartById(@PathVariable  Long cartId){
        if(cartService.getCart(cartId) != null){
            return ResponseEntity.ok(cartService.getCart(cartId));
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(value = "/getAllCart")
    public ResponseEntity<Iterable<Cart>> getAllCart(){
        if(cartService.getAllCarts() != null){
            return  ResponseEntity.ok(cartService.getAllCarts());
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping(value = "/deleteCart/{cartId}")
    public ResponseEntity deleteCart(@PathVariable Long cartId){
        if(cartService.getCart(cartId) != null){
            cartService.deleteCart(cartId);
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
}

