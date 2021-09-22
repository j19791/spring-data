package br.com.alura.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CargoRepository;

@Service //outras classes vao depender dela
public class CrudCargoService {

	private Boolean system = true;
	
	public CrudCargoService(CargoRepository repository) {
		
		this.repository = repository;
	}

	private final CargoRepository repository ; 
	
	public void inicial(Scanner scanner) {
		
		while(system) {
			System.out.println("qual acao de cargo deseja executar?");
			System.out.println("0-sair");
			System.out.println("1-salvar");
			System.out.println("2-atualizar");
			System.out.println("3-visualizar");
			System.out.println("4-deletar");
			int action = scanner.nextInt();
			
			switch(action) {
			
			case 1: salvar(scanner);break;
			case 2: atualizar(scanner); break;
			case 3: visualizar();break;
			case 4: deletar(scanner);break;
			default:
					system = false;
					break;
				
			
			}
			
			
		}
		
		salvar(scanner);
	}
	
	private void deletar(Scanner scanner) {
		
		System.out.println("Id");
		Integer id = scanner.nextInt();
		repository.deleteById(id);
		System.out.println("deletado");
		
		
	}

	private void salvar(Scanner scanner) {
		System.out.println("Descricao do cargo");
		
		String descricao = scanner.next();
		
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		repository.save(cargo);
		System.out.println("Salvo");
		
		
		
	}
	
	private void atualizar(Scanner scanner) {
		System.out.println("Id");
		Integer id = scanner.nextInt();
		
		System.out.println("Descricao do cargo");		
		String descricao = scanner.next();
		
		Cargo cargo = new Cargo();
		cargo.setId(id);		
		cargo.setDescricao(descricao);
		
		repository.save(cargo); //atualiza caso informado id
		System.out.println("Atualizado");
	}
	
	private void visualizar() {
		Iterable<Cargo> cargos = repository.findAll();
		
		cargos.forEach(cargo -> {System.out.println(cargo);});
		
		
		
	}
	
	
	
}
