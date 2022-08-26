package com.astral.dao_blog.entity;

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
    Date commentDate;
}
