public class Visitante {
    private String nome;
    private int idade;

    public Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public void explorarSala(Sala sala) {
        System.out.println("\n➡️ " + nome + " entrou na " + sala.getNome());
        sala.exibirConteudo(); 
    }
}
