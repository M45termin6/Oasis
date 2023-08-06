package org.oasis.cart.entity;


import javax.persistence.*;

@Entity
@Table(name = "cart_item_details")
public class CartItemDetailsEntity extends  BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_id", nullable = false)
    private String clientId;

    @Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "sku_id",nullable = false)
    private  String skuId;

    @Column(name = "service_ref_id")
    private String serviceRefId;

    @Column(name = "cart_id", nullable = false)
    private String cartId;

    @Column(name = "on_behalf_of_id",nullable = false)
    private String onBahalfOfId;  // this is is of user item is added to the cart(end user id, consumer user id)

    @Column(name = "address_id")
    private String addressId; // this address is of the user mentioned as per above consumer id

    @Column(name = "product_quantity",nullable = false)
    private Integer productQuantity;

    @Column(name = "is_active")
    private Boolean isActive;
}
