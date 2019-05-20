/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main2;

/**
 *
 * @author Ricardo
 */
import Disciplina.Disciplina;
public class TestaDisciplina {
 public static void main(String[] args){
     Disciplina d1 = new Disciplina("Pedro", 2, "2º");
     System.out.println("Nome: " + d1.getNome());
     System.out.println("Codigo: " + d1.getCodigo());
     System.out.println("Periodo: " + d1.getPeriodo());
}
}
