package com.tripleD.app.repository;

import com.tripleD.app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 
 * @author CHICHI Hamza
 *
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	Optional<Account> findByLogin(String login);
}
