package br.org.generation.hello3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello3")
public class hello3controller {
@GetMapping
public String hello3() {
	return "Hoje tive muita paciência e atenção aos detalhes";
}
}
