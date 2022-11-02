package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Details")
public class Details {
    @Id
    private int id;
    private String name;
    private String place;
    private String type;
    private String status;
}
