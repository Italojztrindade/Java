package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Calculadora;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

	@GetMapping("/{primeiroValor}/{segundoValor}")
	public int soma(@PathVariable int primeiroValor,@PathVariable int segundoValor) {
		Calculadora teste = new Calculadora(primeiroValor, segundoValor);
		int resultado = teste.calculandoASoma(primeiroValor, segundoValor);
		return resultado;
		
	}
	
	@GetMapping(path = "/subtrair")
	public int subtracao(@RequestParam(name = "a") int primeiroValor,
			@RequestParam(name = "b") int segundoValor) {
		int resultado = primeiroValor - segundoValor;
		return resultado;
		
	}
	
	
//	resolução 
//	@GetMapping("/somar/{a}/{b}")
//	public int somar(@PathVariable int a, @PathVariable int b) {
//		return a + b;
//	}
//	
//	
//	// /calculadora/subtrair?a=100&b=39
//	@GetMapping("/subtrair")
//	public int subtrair(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
//		return a - b;
//	}
	
}
