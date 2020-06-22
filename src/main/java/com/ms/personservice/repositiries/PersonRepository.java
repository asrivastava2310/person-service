package com.ms.personservice.repositiries;

import com.ms.personservice.entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.stream.Stream;

@Repository
public interface PersonRepository extends MongoRepository<Person, BigInteger> {
    Stream<Person> findByNameContaining(String name);
    Stream<Person> findByPlaceIgnoringCase(String place);
}
