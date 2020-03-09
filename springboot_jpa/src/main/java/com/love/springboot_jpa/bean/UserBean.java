package com.love.springboot_jpa.bean;


import javax.persistence.*;

@Entity
@Table(name = "user_tab")
public class UserBean {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private Integer id;
    @Column(name = "last_name")
    private String name;
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
