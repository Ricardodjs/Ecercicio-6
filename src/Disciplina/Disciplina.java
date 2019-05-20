/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disciplina;

/**
 *
 * @author Ricardo
 */
public class Disciplina {
    private String nome;
    private int codigo;
    private String periodo;
    public Disciplina(String n, int c, String p){
        setNome(n);
        setCodigo(c);
        setPeriodo(p);      
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void SetCodigo(int c){
      this.codigo = c;
    }
    public String getPeriodo(){
     return this.periodo; 
    }
    public void setPeriodo(String p){
         this.periodo = p;
    }
}
