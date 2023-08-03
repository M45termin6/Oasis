package org.oasis.cart.service;

import org.oasis.cart.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.oasis.cart.repository.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;


    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart getCart(Long cartId){
        return cartRepository.findById(cartId).orElse(null);
    }

    public Iterable<Cart> getAllCarts(){
        return  cartRepository.findAll();
    }

    public  void deleteCart(@PathVariable Long cartId){
        cartRepository.deleteById(cartId);
    }

}

