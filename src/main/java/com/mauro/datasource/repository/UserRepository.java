package com.mauro.datasource.repository;
import com.mauro.datasource.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
