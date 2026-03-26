import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Chama o método para ler os dados
        Dados dados = lerDados(scanner);

        // Chama p método para exibir a mensagem
        exibirMensagem(dados);

        scanner.close();
    }

 
}