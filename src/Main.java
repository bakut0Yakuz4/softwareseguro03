import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Digite uma musica");

        String musica = scanner.nextLine();

        System.out.println("Digite um album");

        String album = scanner.nextLine();
        //System.out.println("Nome é: " + nome);

        Pessoa p = new Pessoa("", 0);
        Musica m = new Musica();
        Album a = new Album();

        System.out.println("Tocando musica" );


    }
}