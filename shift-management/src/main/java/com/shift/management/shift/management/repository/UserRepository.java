package com.shift.management.shift.management.repository;

import com.shift.management.shift.management.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
