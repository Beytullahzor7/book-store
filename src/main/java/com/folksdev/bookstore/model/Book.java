package com.folksdev.bookstore.model;

import lombok.*;

import javax.persistence.*;

@Table
@Data
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String author;
    private Double price;
    private Integer stock;
}
