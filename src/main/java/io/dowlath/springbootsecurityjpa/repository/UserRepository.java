package io.dowlath.springbootsecurityjpa.repository;

import io.dowlath.springbootsecurityjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @Author Dowlath
 * @create 7/12/2020 6:24 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String userName);
}
