package com.tripleD.app.service;



import com.tripleD.app.dto.AccountDTO;
import com.tripleD.app.dto.AuthenticationDTO;
import com.tripleD.app.dto.JwtDTO;
import com.tripleD.app.entity.Account;

import java.util.List;
import java.util.Optional;

/**
 * 
 * @author EL KOTB ZAKARIA
 *
 */
public interface AccountService {

	Optional<Account> findByLogin(String login);

	JwtDTO authenticateUser(AuthenticationDTO authenticationDTO) throws Exception;

	List<AccountDTO> getAccounts();

	String getConnectedUser();

}
