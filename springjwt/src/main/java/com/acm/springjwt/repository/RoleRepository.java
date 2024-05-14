package com.acm.springjwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acm.springjwt.models.RoleEntity;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity,Long>{
    
}
