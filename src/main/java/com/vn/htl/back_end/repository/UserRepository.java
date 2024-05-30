package com.vn.htl.back_end.repository;

import com.vn.htl.back_end.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
