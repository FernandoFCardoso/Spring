package br.org.generation.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello2")
public class hello2controller {
@GetMapping
public String hello2() {
	
	return "Hoje tive Persistência e proatividade em buscar ajuda com meus queridos e amigos colegas";
	
}
}
