public class Jogador {

    //atributos
    private String nome;
    private String sobreNome;
    private String idade;
    private String time;

    //construtor
    public void setNome(String n) {
        this.nome = n;
    }
    public void setSobrenome(String s) {
        this.sobreNome = s;
    }
    public void setIdade(String i) {
        this.idade = i;
    }
    
    
    //metodos
    public void mostrarNomeSobrenome()
    {
        System.out.println( this.nome + " " + this.sobreNome);
    }

    
}


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


public class Time {

    //atributos
    private String nome;
    private String escudo;
    
    //construtor
    public void setNome(String ntime){
    this.nome = ntime;
}
    public void setEscudo(String nescudo){
        this.escudo = nescudo;
    }
}
