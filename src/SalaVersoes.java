public class SalaVersoes extends Sala {
    public SalaVersoes(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("\n📜 " + getNome() + " (" + getAnoCriacao() + ")");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("• Java 1.0 (1996) - Primeira versão pública.");
        System.out.println("• Java 5 (2004) - Genéricos, Annotations, Enum, Autoboxing.");
        System.out.println("• Java 8 (2014) - Lambdas, Streams, nova API de Data.");
        System.out.println("• Java 17 (2021) - LTS, Pattern Matching, Sealed Classes.");
    }
}
