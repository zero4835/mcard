package com.mcard.backend.repo;

import com.mcard.backend.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findByUserNameContaining(String keyword);
}
