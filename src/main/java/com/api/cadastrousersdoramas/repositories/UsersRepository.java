package com.api.cadastrousersdoramas.repositories;

import com.api.cadastrousersdoramas.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
