package com.example.homeservices.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class Customer extends BaseUser   {
    @OneToMany(mappedBy = "customer")
    private List<Order> orderId;

}
