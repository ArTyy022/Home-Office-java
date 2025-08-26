import java.util.Scanner;

public class MuseuDaProgramacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("🏛️ Bem-vindo ao Museu da Programação!");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        Visitante visitante = new Visitante(nome, idade);


        Sala sala1 = new SalaFundadores("Sala dos Fundadores", "A origem do Java e seus criadores.", 1995);
        Sala sala2 = new SalaVersoes("Sala das Versões", "Evolução das versões do Java.", 1996);
        Sala sala3 = new SalaCuriosidades("Sala das Curiosidades", "Fatos divertidos sobre Java.", 1997);

        int opcao;
        do {
            System.out.println("\n=== MENU DO MUSEU ===");
            System.out.println("Visitante: " + visitante.getNome() + " (" + visitante.getIdade() + " anos)");
            System.out.println("1 - " + sala1.getNome());
            System.out.println("2 - " + sala2.getNome());
            System.out.println("3 - " + sala3.getNome());
            System.out.println("0 - Sair");
            System.out.print("Escolha uma sala: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> visitante.explorarSala(sala1);
                case 2 -> visitante.explorarSala(sala2);
                case 3 -> visitante.explorarSala(sala3);
                case 0 -> System.out.println("\nObrigado pela visita! ☕ Até a próxima!");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

    }
}
