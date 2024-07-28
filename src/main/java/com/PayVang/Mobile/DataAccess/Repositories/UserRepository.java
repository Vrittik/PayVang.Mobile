package com.PayVang.Mobile.DataAccess.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.PayVang.Mobile.DataAccess.Models.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmailId(String username);
    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.password = :password WHERE u.emailId = :email")
    void updatePasswordByEmail(String email, String password);
}