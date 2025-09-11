package com.itb.inf2dm.pizzariad2.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Telefone")
public class Telefone {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Column(length = 5, nullable = false)
   private String ddd;
   @Column(length = 5, nullable = false)
   private String numero;
   private boolean codStatus;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}

