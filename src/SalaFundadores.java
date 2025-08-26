public class SalaFundadores extends Sala {
    public SalaFundadores(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("\n📜 " + getNome() + " (" + getAnoCriacao() + ")");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("A historia do java: " + " \n A linguagem de programação Java foi criada na década de 1990 pela Sun Microsystems, sob a liderança de James Gosling, como parte do Projeto Green. \n" +
        " Com o objetivo inicial de criar uma linguagem portátil para dispositivos eletrônicos. \n" +
        " Lançada oficialmente em 1995 com o lema \"Escreva uma vez, rode em qualquer lugar\" (Write Once, Run Anywhere).\n" +
         "Java se tornou popular na web e foi adquirida pela Oracle em 2010, tornando-se uma plataforma robusta para o desenvolvimento de diversas aplicações. ");
        System.out.println("Criador: James Gosling na Sun Microsystems.");
        System.out.println("Projeto inicial chamado Oak (1991).");
        System.out.println("Java lançado oficialmente em 1995.");
    }
}
