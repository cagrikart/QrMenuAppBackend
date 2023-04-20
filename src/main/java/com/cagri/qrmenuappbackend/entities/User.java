package com.cagri.qrmenuappbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class User extends BaseEntity{

    private String name;
    private String email;
    private String password;

}
