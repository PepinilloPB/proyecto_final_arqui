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
| amount  | decimal(12,2)       | YES  |     | NULL              |                |
| status  | tinyint(1)          | YES  |     | 1                 |                |
| created | timestamp           | NO   |     | CURRENT_TIMESTAMP |                |
+---------+---------------------+------+-----+-------------------+----------------+
*/

@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer     id;
    @Column
    private String      name;
    @Column
    private Double      amount;
    @Column
    private Boolean     status;
    @Column
    private Timestamp   created;

    public Cuenta() 
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

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
