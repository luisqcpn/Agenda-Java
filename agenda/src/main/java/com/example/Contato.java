package com.example;
public class Contato {

    private String nome;
    private String sexo;
    private String telefone;
    private String email;

    public Contato(String nome, String sexo, String telefone, String email)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String Imprimir(){
        String saida = "";
        saida += "Contato \n nome:" +getNome()+"\n sexo: "+getSexo()+"\n telefone: "+getTelefone()+"\n email:  "+getEmail()+".";
        return saida;
    }

}
    

