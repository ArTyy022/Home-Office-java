public class SalaCuriosidades extends Sala {
    public SalaCuriosidades(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("\n📜 " + getNome() + " (" + getAnoCriacao() + ")");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("• O nome Java vem do café da ilha de Java (Indonésia).");
        System.out.println("• O mascote oficial é o Duke, criado pela Sun Microsystems.");
        System.out.println("• O slogan original era: 'Write Once, Run Anywhere'.");
    }
}
