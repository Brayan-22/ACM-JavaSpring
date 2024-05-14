package com.acm.springjwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acm.springjwt.models.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
}
