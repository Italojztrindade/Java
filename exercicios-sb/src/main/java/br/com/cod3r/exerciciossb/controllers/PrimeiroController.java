package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@RequestMapping(path = { "/ola", "/saudacao" })
	public String ola() {
		return "Olá Spring Boot! 2";
	}
	
}
