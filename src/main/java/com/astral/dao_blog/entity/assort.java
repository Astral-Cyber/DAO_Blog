package com.astral.dao_blog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class assort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String name;
    @JsonIgnore
    @JoinColumn
    @OneToMany
    List<article> articles;
}
