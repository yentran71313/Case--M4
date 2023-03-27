//package com.spbproductmanagementjwt.cartdetail;
//
//import com.spbproductmanagementjwt.cart.Cart;
//import com.spbproductmanagementjwt.model.BaseEntity;
//import com.spbproductmanagementjwt.product.Product;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Entity
//@Accessors(chain = true)
//@Table(name = "cart_details")
//public class CartDetail extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
//    private Product product;
//
//    @Column(name = "product_name")
//    private String productName;
//
//    @Column(name = "product_price", precision = 12, scale = 0, nullable = false)
//    private BigDecimal productPrice;
//
//    @Column(name = "product_quantity")
//    private Long productQuantity;
//
//    @Column(name = "product_amount", precision = 12, scale = 0, nullable = false)
//    private BigDecimal productAmount;
//
//    @ManyToOne
//    @JoinColumn(name = "cart_id", referencedColumnName = "id", nullable = false)
//    private Cart cart;
//}
