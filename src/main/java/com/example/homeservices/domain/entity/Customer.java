package com.example.homeservices.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Customer extends BaseUser {
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_ORDER_ID")
    private List<Order> orderId;

}
