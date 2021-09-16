package TrabalhoRefatoracao;

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