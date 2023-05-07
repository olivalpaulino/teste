package br.com.dobackaofront.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String getNome() {
		return "Olival - Treinamento Spring Framework";
	}
}
