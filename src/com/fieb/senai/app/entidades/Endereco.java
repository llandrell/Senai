

package com.fieb.senai.app.entidades;

import java.util.Objects;


public class Endereco {
    private String logradoro;
    private String numero;
    private String bairro;

    private Cidade cidadade;

    public Cidade getCidadade() {
        return cidadade;
    }

    public void setCidadade(Cidade cidadade) {
        this.cidadade = cidadade;
    }
    
    
            
    public Endereco(String logradoro, String numero, String bairro) {
        this.logradoro = logradoro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getLogradoro() {
        return logradoro;
    }

    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.logradoro);
        hash = 53 * hash + Objects.hashCode(this.numero);
        hash = 53 * hash + Objects.hashCode(this.bairro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.logradoro, other.logradoro)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        return true;
    }
    
    
    
}
