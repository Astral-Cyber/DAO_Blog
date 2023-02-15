package com.astral.dao_blog.entity;

import com.astral.dao_blog.util.DateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
    String intro;
    @Column(columnDefinition = "LONGTEXT")
    String Content;
    @Column
    @JsonSerialize(using = DateSerializer.class)
    Date releaseDate;
    @ManyToOne
    @JoinColumn
    assort as;
    @JsonIgnore
    @JoinColumn
    @OneToMany
    List<comment> comments;
}