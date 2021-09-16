package TrabalhoRefatoracao;
import java.util.Scanner;

public class JogadorTester {

    public static void main(String[] args) {
        
        Jogador jog1 = new Jogador();

        Scanner teclado = new Scanner (System.in);

        System.out.printf("Digite o nome do jogador: ");
        jog1.setNome( teclado.next() );
        
        System.out.printf("Digite seu sobrenome: ");
        jog1.setSobrenome( teclado.next() );
        
        System.out.printf("Digite sua idade: ");
        jog1.setIdade( teclado.next() );

        Time time1 = new Time();
        
        System.out.printf("Digite o time: ");
        time1.setNome( teclado.next());

        jog1.mostrarNomeSobrenome();
     
        teclado.close();
    }
}