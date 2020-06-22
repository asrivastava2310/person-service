package com.ms.personservice;

import com.ms.personservice.entities.Person;
import com.ms.personservice.repositiries.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigInteger;

@SpringBootApplication
public class PersonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner seedDatabase(PersonRepository repository){
		return args -> {
			repository.save(Person.builder()
							.id(BigInteger.valueOf(1))
							.name("John Snow")
							.place("Winterfell")
							.aka("King in the north,Lord Commander")
							.build()
			             );
			repository.save(Person.builder()
					.id(BigInteger.valueOf(2))
					.name("Tyrion Lannister")
					.place("Caterly Rock")
					.aka("Hand of teh queen,Halfman")
					.build()
			);
			repository.save(Person.builder()
					.id(BigInteger.valueOf(3))
					.name("Daenerys Targaryen")
					.place("Meereen")
					.aka("Khaleesi")
					.build()
			);
			repository.save(Person.builder()
					.id(BigInteger.valueOf(4))
					.name("Night King")
					.place("Beyond teh wall")
					.aka("White Walker")
					.build()
			);
			repository.save(Person.builder()
					.id(BigInteger.valueOf(5))
					.name("Cerci Lannister")
					.place("Westeros")
					.aka("Protector of the realm")
					.build()
			);

		};
	}

}
