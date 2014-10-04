/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.model.etities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Patrícia Meneses
 */
@Entity
@Table(name = "empresa")

public class Empresa {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "IdEmpresa", nullable = false)
    private Integer idEmpresa;
    @Column(name = "Nome", nullable = false, length = 80)
    private String nome;
    @Column(name = "Cnpj", nullable = false, length = 80)
    private String cnpj;
    @Column(name = "Telefone", nullable = false, length = 80)
    private String telefone;
    @Column(name = "Email", nullable = false, length = 80)
    private String email;

    public Empresa() {
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.idEmpresa != null ? this.idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.idEmpresa != other.idEmpresa && (this.idEmpresa == null || !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    
    
    
}
