package org.oasis.cart.entity;

import org.oasis.cart.enums.CartTypeEnum;

import javax.persistence.*;

@Entity
@Table(name = "cart_details")
public class CartDetailsEntity extends  BaseEntity{

    @Id
    private String cartId;

    @Column(name = "billing_address_id")
    private String billingAddressId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "cart_type",nullable = false)
    private CartTypeEnum cartType;

    @Column(name = "is_active",nullable = false)
    private Boolean isActive;
}
