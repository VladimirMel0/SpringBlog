package com.springBlog.springBlog.model;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column
    private String title;
    @Lob
    @Column
    @NotEmpty
    private String content;
    @Column
    private Instant createdOn;
    @Column
    private Instant updatedOn;
    @Column
    @NotBlank
    private String username;


    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getUserName () {return username;}

    public void setUserName(String userName) {this.username = userName ;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}



    
}
