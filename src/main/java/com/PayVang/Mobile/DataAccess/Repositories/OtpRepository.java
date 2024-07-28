package com.PayVang.Mobile.DataAccess.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PayVang.Mobile.DataAccess.Models.Otp;

@Repository
public interface OtpRepository extends JpaRepository<Otp, Long> {
    Otp findByRecipient(String recipient);
}
