package com.PayVang.Mobile.DataAccess.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PayVang.Mobile.DataAccess.Models.LoginDetails;

@Repository
public interface LoginDetailRepository extends JpaRepository<LoginDetails, Long> {
    LoginDetails findByUsername(String username);
}
