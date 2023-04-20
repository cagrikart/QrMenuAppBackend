package com.cagri.qrmenuappbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "orders")
@Entity
public class Order  extends BaseEntity{

    private String orderNumber;
    private Date dateTime;

}
