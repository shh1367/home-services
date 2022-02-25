package com.example.homeservices.domain.entity;

import com.example.homeservices.domain.entity.core.AbstractBaseEntity;
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
public class Order extends AbstractBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Column(nullable = false, length = 30)
    private String taskDescription;
    @Column(nullable = false)
    private Date orderDate;
    @Column(nullable = false, length = 30)
    private String customerAddress;
    @Column(nullable = false)
    private OrderState orderState;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CUSTOMER_ID")
    private Customer customer;
    @Column(nullable = true)
    private String customerComment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_SPECIALIST_ID")
    private Specialist specialist;
}
