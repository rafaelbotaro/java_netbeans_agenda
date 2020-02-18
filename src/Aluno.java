/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Aluno {
    public String RA, nome, email;
    
    public Aluno(String RA, String nome, String email) {
        this.RA = RA;
        this.nome = nome;
        this.email = email;
    }
    
    public String imprimir()
    {
        return "RA: "+RA+" - "+nome+" e-mail: "+email;
    }
}
