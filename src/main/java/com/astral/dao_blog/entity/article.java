package com.astral.dao_blog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
public class article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String topic;
    @Column
    String URL;
    @Column
    Date releaseDate;
    @ManyToOne
    @JoinColumn
    assort as;
    @JsonIgnore
    @JoinColumn
    @OneToMany
    List<comment> comments;
}
