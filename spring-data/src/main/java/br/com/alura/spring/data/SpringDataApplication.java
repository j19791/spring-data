package br.com.alura.spring.data;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CargoRepository;
import br.com.alura.spring.data.service.CrudCargoService;

@SpringBootApplication //varre toda app e ler as anotações Spring
public class SpringDataApplication implements CommandLineRunner
{

	private Boolean system = true;
	
	
	private final CrudCargoService cargoService ; 
	
	//o Spring vai criar um CargoRepository (interface) pela Injeção de dependencias
	public SpringDataApplication(CrudCargoService cargoService) {
		this.cargoService = cargoService;
	}

	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);//inicializa o framework junto c/ a app
	}

	@Override
	public void run(String... args) throws Exception { //executado depois do método main finalizado(depois de executado a aplicação)
		
		Scanner scanner = new Scanner(System.in); //para pegasr os valores q o usuário digita no console
		
		while(system) {
			System.out.println("Qual ação vc quer executar ?");
			System.out.println("0-sair");
			System.out.println("1-cargo");
			
			int action = scanner.nextInt(); //pega o valor digitado pelo usuário
			if(action==1) {
				cargoService.inicial(scanner);
			}else system = false;
				
			
		}	
		
	}
	
	

}
