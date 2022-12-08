package com.springbootjwtauthentication.repository;

import com.springbootjwtauthentication.models.Role;
import com.springbootjwtauthentication.models.ERole;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(ERole name);

}
