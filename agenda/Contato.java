/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Rafael Botaro
 */
public class Contato {
    
    private String celular, nome, email;
    
    public Contato(String celular, String nome, String email) {
        this.celular = celular;
        this.nome = nome;
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String imprimir()
    {
        return "\n\n      Celular: "+celular+"\n      Nome: "+nome+"\n      E-mail: "+email+"\n\n  ";
    
    }
}
