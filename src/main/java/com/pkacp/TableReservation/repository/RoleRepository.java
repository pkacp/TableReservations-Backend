package com.pkacp.TableReservation.repository;

import java.util.Optional;

import com.pkacp.TableReservation.models.Role;
import com.pkacp.TableReservation.models.enums.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(Roles name);
}
