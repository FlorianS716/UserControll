package io.UserControll.UserControll.repo;

import io.UserControll.UserControll.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByMail(String mail);
}
