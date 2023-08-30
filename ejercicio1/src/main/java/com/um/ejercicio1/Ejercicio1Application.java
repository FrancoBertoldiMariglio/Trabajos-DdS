package com.um.ejercicio1;


import com.um.ejercicio1.entidades.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.um.ejercicio1.entidades.Persona;
import com.um.ejercicio1.repositorios.PersonaRepository;

@SpringBootApplication
public class Ejercicio1Application {

	@Autowired
	private PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	@Bean
	CommandLineRunner init(PersonaRepository personaRepository) {
		return args -> {
			System.out.println("--------------------------ESTOY FUNCIONANDO--------------------------");
			Persona persona = Persona.builder()
					.nombre("Juan")
					.apellido("Perez")
					.edad(20)
					.build();

			Domicilio domicilio = Domicilio.builder()
					.calle("Suipacha")
					.numero(123)
					.build();

			persona.setDomicilio(domicilio);

			personaRepository.save(persona);

			Persona personaRecuperada = personaRepository.findById(persona.getId()).orElse(null);
			if (personaRecuperada != null) {
				System.out.println(personaRecuperada.toString());
			}
			else {
				System.out.println("No se pudo recuperar la persona");
			}
		};
	}
}