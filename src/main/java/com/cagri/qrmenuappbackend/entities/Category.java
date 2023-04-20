package com.cagri.qrmenuappbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "category")
public class Category extends BaseEntity {

    private String name;

}