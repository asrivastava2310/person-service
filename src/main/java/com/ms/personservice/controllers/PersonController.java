package com.ms.personservice.controllers;

import com.ms.personservice.entities.Person;
import com.ms.personservice.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@AllArgsConstructor
public class PersonController {
    private PersonService personService;

    @GetMapping("/get")
    public Stream<Person> getByName(@RequestParam(required = false) String name,@RequestParam(required = false) String place){
        if(!StringUtils.isEmpty(name)){
            return personService.getByName(name);
        }else if(!StringUtils.isEmpty(place)){
            return personService.getByPlace(place);
        }else{
            return personService.getAll();
        }
    }

    @GetMapping("/{id}")
    public Optional<Person> getById(@PathVariable BigInteger id){
        return personService.getById(id);
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person){
      return personService.save(person);
    }
}