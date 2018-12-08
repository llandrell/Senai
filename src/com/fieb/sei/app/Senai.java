
package com.fieb.sei.app;

import com.fieb.senai.app.entidades.Cidade;
import com.fieb.senai.app.entidades.Endereco;
import com.fieb.senai.app.entidades.Estado;
import com.fieb.senai.app.entidades.Pessoa;
import com.fieb.senai.app.entidades.Telefone;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class Senai {

   
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 5878464, 42);
        Endereco end1 = new Endereco("Rua A", "25", "Ribeira");
        Telefone tel1 = new Telefone("3212-8558");
        Cidade cid1 = new Cidade("Salvador");
        Estado est1 = new Estado("Bahia");
        
        
        
        p1.setEndereco(end1);
        p1.setTelefone(Arrays.asList(tel1));
        p1.getEndereco().setCidadade(cid1);
        p1.getEndereco().getCidadade().setEstado(est1);
        
        
        Pessoa p2 = new Pessoa("José", 5864, 45);
        Endereco end2 = new Endereco("Rua b", "41", "Pituba");
        Telefone tel2 = new Telefone("99889-6840");
        Cidade cid2 = new Cidade("Salvador");
        Estado est2 = new Estado("Bahia");
        
        p2.setEndereco(end2);
        p2.setTelefone(Arrays.asList(tel2));
        p2.getEndereco().setCidadade(cid2);
        p2.getEndereco().getCidadade().setEstado(est2);
       
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
