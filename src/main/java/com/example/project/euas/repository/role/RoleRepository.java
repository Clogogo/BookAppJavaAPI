package com.example.project.euas.repository.role;

import com.example.project.euas.model.role.EnumRole;
import com.example.project.euas.model.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(EnumRole name);
}
