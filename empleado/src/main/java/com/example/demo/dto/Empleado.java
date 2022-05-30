package com.example.demo.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
+---------+---------------------+------+-----+-------------------+----------------+
| Field   | Type                | Null | Key | Default           | Extra          |
+---------+---------------------+------+-----+-------------------+----------------+
| id      | bigint(20) unsigned | NO   | PRI | NULL              | auto_increment |
| name    | varchar(50)         | NO   |     | NULL              |                |
| status  | tinyint(1)          | YES  |     | 1                 |                |
| created | timestamp           | NO   |     | CURRENT_TIMESTAMP |                |
+---------+---------------------+------+-----+-------------------+----------------+
*/
@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer     id;
    @Column
    private String      name;
    @Column
    private Boolean     status;
    @Column
    private Timestamp   created;

    public Empleado() 
    {

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isStatus() {
        return this.status;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
}
