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
| coid    | int(11)             | YES  |     | NULL              |                |
| cdid    | int(11)             | YES  |     | NULL              |                |
| eid     | int(11)             | YES  |     | NULL              |                |
| amount  | decimal(7,2)        | YES  |     | NULL              |                |
| status  | tinyint(1)          | YES  |     | 1                 |                |
| created | timestamp           | NO   |     | CURRENT_TIMESTAMP |                |
+---------+---------------------+------+-----+-------------------+----------------+
*/

@Entity
@Table(name = "transaccion")
public class Transaccion {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer     id;
    @Column
    private Integer     coid;
    @Column
    private Integer     cdid;
    @Column
    private Integer     eid;
    @Column
    private Double      amount;
    @Column
    private Boolean     status;
    @Column
    private Timestamp   created;

    public Transaccion() 
    {

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoid() {
        return this.coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public Integer getCdid() {
        return this.cdid;
    }

    public void setCdid(Integer cdid) {
        this.cdid = cdid;
    }

    public Integer getEid() {
        return this.eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
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
