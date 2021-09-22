package br.com.alura.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CargoRepository;

@Service //outras classes vao depender dela
public class CrudCargoService {

	public CrudCargoService(CargoRepository repository) {
		
		this.repository = repository;
	}

	private final CargoRepository repository ; 
	
	public void inicial(Scanner scanner) {
		salvar(scanner);
	}
	
	private void salvar(Scanner scanner) {
		System.out.println("Descricao do cargo");
		
		String descricao = scanner.next();
		
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		repository.save(cargo);
		System.out.println("Salvo");
		
		
		
	}
	
	
	
}
