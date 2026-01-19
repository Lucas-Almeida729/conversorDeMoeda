import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();
        Gson gson = new Gson();

        // COLOQUE SUA CHAVE AQUI
        String apiKey = "SUA_CHAVE_AQUI";

        String moedaOrigem = "";
        String moedaDestino = "";
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n*************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println("\n1) Dólar =>> Real Brasileiro");
            System.out.println("2) Real Brasileiro =>> Dólar");
            System.out.println("3) Dólar =>> Peso Argentino");
            System.out.println("4) Peso Argentino =>> Dólar");
            System.out.println("5) Real Brasileiro =>> Peso Argentino");
            System.out.println("6) Peso Argentino =>> Real Brasileiro");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("*************************************************");

            opcao = leitura.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    moedaOrigem = "USD";
                    moedaDestino = "BRL";
                    break;
                case 2:
                    moedaOrigem = "BRL";
                    moedaDestino = "USD";
                    break;
                case 3:
                    moedaOrigem = "USD";
                    moedaDestino = "ARS";
                    break;
                case 4:
                    moedaOrigem = "ARS";
                    moedaDestino = "BRL";
                    break;
                case 5:
                    moedaOrigem = "BRL";
                    moedaDestino = "ARS";
                    break;
                case 6:
                    moedaOrigem = "ARS";
                    moedaDestino = "BRL";
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Digite o valor que deseja converter:");
            double valor = leitura.nextDouble();

            String endereco = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaOrigem + "/" + moedaDestino;

            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                Moeda moeda = gson.fromJson(response.body(), Moeda.class);

                double valorConvertido = valor * moeda.conversion_rate();

                System.out.printf("Valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]\n",
                        valor, moedaOrigem, valorConvertido, moedaDestino);

            } catch (Exception e) {
                System.out.println("Erro na conexão: " + e.getMessage());
            }
        }
    }
}
