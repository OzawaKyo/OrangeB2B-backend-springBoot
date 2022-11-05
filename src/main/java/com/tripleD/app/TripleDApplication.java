package com.tripleD.app;

import com.tripleD.app.entity.Account;
import com.tripleD.app.entity.Role;
import com.tripleD.app.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author CHICHI Hamza
 *
 */
@SpringBootApplication
public class TripleDApplication implements CommandLineRunner {
@Autowired
private   BCryptPasswordEncoder bCryptPasswordEncoder;
@Autowired
private AccountRepository accountRepository;

	public static void main(String[] args)  {
		SpringApplication.run(TripleDApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Role role = new Role("ADMIN");
		Account mohamed = new Account("root",bCryptPasswordEncoder.encode("root"));
	mohamed.setRole(role);
		accountRepository.save(mohamed);
		
	}
}
