package com.example.homeservices.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Column(nullable = false , length = 30 )
    private String taskDescription;
    @Column(nullable = false )
    private Date orderDate;
    @Column(nullable = false , length = 30 )
    private String customerAddress;
    @Column(nullable = false )
    private OrderState orderState ;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CUSTOMER_ID")
    private List<Customer> customer;
    @Column(nullable = true)
    private String customerComment;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_SPECIALIST_ID")
    private Specialist specialist ;
}
