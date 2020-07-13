package com.markaves.multipledatabase.dao.user;

import com.markaves.multipledatabase.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}