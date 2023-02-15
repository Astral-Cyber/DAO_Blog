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
    String name;
//    @Column
//    Integer id;
    @JsonIgnore
    @Column
    @OneToMany(mappedBy = "as")
    List<article> articles;
}
