package com.example;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> listaContato = new ArrayList<>();


    public void adiconarContato(Contato cont){
        listaContato.add(cont);
    }

    public String listarContato(){
        String saida = "";
        for(Contato cont: listaContato){
            saida += cont.Imprimir();
        }
        return saida;
    }

    public void removerContato(String nome){
        for(int i =0; i <listaContato.size(); i++){
            if(listaContato.get(i).getNome().equals(nome)){
                listaContato.remove(i);
            }
        }
    }

    public void editarContato(String nome, Contato cont){
        for(int i =0; i <listaContato.size(); i++){
            if(listaContato.get(i).getNome().equals(nome)){
                listaContato.set(i, cont);
            }
        }
    }

    
}
