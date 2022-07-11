package com.vadlapalli.onlinepickles.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vadlapalli_user")
public class User extends AbstractEntity {

    private String userName;
    private String password;
    private String email;
}