package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;
// Repositorio é um tipo de classe, é como um select *from 
@Repository //Ela que faz a comunicação com o banco de dados, para consultar dados do MY
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
//Jpa já vem junto do applcation, Interface: classe fixa, nao é acessivel, serve pra ligar o banco de dados 
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
		
}
