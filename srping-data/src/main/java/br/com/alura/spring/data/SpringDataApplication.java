package br.com.alura.spring.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApplication {

//	private final CargoRepository repository;
//	
//	public SpringDataApplication(CargoRepository repository) {
//		this.repository = repository;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Cargo cargo = new Cargo();
//		cargo.setDescricao("DESENVOLVEDOR DE SOFTWARE");
//		
//		repository.save(cargo);
//	}

}
