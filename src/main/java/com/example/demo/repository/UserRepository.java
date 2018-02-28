package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by framgia on 28/02/2018.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
