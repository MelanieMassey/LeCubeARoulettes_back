package com.lecubearoulettes.repository;

import com.lecubearoulettes.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    Optional<RoleEntity> findByRolename(String name);
}
