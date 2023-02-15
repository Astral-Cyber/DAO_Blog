package com.astral.dao_blog.entity;

import com.astral.dao_blog.util.DateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String name;
    @Column
    String content;
    @Column
    @JsonSerialize(using = DateSerializer.class)
    Date commentDate;
}
