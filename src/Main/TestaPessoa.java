
package Main;

/**
 *
 * @author Ricardo
 */
import Escola.Pessoa;
public class TestaPessoa {
  public static void main(String[] args){
      Pessoa p1 = new Pessoa("Ricardo", "Rua Dr Duque, 10", "3837402103");
      System.out.println("Nome: " + p1.getNome());
      System.out.println("Endereco: " + p1.getEndereco());
      System.out.println("Telefone: " + p1.getTelefone());
  }  
}
