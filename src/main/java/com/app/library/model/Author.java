package com.app.library.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "au_id", nullable = false)
    private int au_id;



    @Column(name = "au_introduce", nullable = false)
    private String au_introduce;

    @Column(name = "au_full_name", nullable = false, length = 45)
    private String au_full_name;

    @Column(name = "au_image", length = 100)
    private String au_image;

}

