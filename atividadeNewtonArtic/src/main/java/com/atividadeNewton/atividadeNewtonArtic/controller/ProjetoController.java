package com.atividadeNewton.atividadeNewtonArtic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjetoController {


	@GetMapping
	public String ola() {
		return "Seja bem vindo";
	}
	@GetMapping(path = "/compra")
	public String compra() {
		return "Deseja comprar o que?";
	}
	@GetMapping(path = "/vendas")
	public String vendas() {
		return "Deseja vender o que?";
	}
	@GetMapping(path = "/estoque")
	public String estoque() {
		return "Temos no estoque: nada";
	}



	@GetMapping(path = "/Users")
	public String Users() {
		return "Usuarios:";
	}
	@GetMapping(path = "/Funcionarios")
	public String Funcionarios() {
		return "Funcionarios:";
	}
	@GetMapping(path = "/Visitantes")
	public String Visitantes() {
		return "Visitantes:";
	}
	@GetMapping(path = "/Adimin")
	public String Adimin() {
		return "AdiminS:";
	}
}
