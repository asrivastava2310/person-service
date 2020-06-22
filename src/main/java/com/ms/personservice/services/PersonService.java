package com.ms.personservice.services;

import com.ms.personservice.entities.Person;
import com.ms.personservice.repositiries.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class PersonService {
    private PersonRepository personRepository;
    public Stream<Person> getByName(String name){
         return personRepository.findByNameContaining(name);
    }
    public Stream<Person> getByPlace(String place){
        return personRepository.findByPlaceIgnoringCase(place);
    }
    public Stream<Person> getAll(){
        return personRepository.findAll().stream();
    }
    public Optional<Person> getById(BigInteger id){
        return personRepository.findById(id);
    }
    public Person save(Person person){
        return personRepository.save(person);
    }
}
