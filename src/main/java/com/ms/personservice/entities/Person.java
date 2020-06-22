package com.ms.personservice.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
//For Intellij, we may need to install Lombok plugin
public class Person {
    @Id private BigInteger id;
    private String name;
    private String place;
    private String aka;
}
