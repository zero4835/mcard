package com.mcard.backend.repo;

import com.mcard.backend.model.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepo extends JpaRepository <UserAccountEntity, Integer>{
    UserAccountEntity findByEmail(String email);
}
