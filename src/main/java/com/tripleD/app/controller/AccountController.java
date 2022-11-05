package com.tripleD.app.controller;

import com.tripleD.app.dto.AuthenticationDTO;
import com.tripleD.app.dto.JwtDTO;
import com.tripleD.app.repository.AccountRepository;
import com.tripleD.app.service.AccountService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author CHICHI Hamza
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/OrangeB2B/api/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private AccountRepository rep;


	@PostMapping("/login")
	public JwtDTO authenticate(@RequestBody AuthenticationDTO authenticationDTO) throws Exception {
		return this.accountService.authenticateUser(authenticationDTO);
	}

	/*@PutMapping("/{id}")
	@Operation(security = { @SecurityRequirement(name = "Bearer Token") })
	public Account updateAccount(@PathVariable Long id, @Valid @RequestBody Account authenticationDTO)
			throws Exception {
		authenticationDTO.setId(id);
		return this.rep.save(authenticationDTO);
	}*/

}