package com.cagri.qrmenuappbackend.repository;

import com.cagri.qrmenuappbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
