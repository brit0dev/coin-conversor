import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Converter converter = new Converter();
        boolean loop = true;

        int entrada;
        double valor,valorConvertido;

        String divisor = "****************************";
        String mensagem = "Seja bem-vindo/a ao Conversor de moeda =]\n";
        String menu = 
                """
                    1) Dólar =>> Peso Argentino
                    2) Peso Argentino =>> Dólar
                    3) Dólar =>> Real Brasileiro
                    4) Real Brasileiro =>> Dólar
                    5) Dólar =>> Peso Colombiano
                    6) Peso colombiano =>> Dólar
                    7) Sair
                    Escolha uma opção válida:
                """;


        while (loop) {
            System.out.println(divisor);
            System.out.println(mensagem);
            System.out.println(menu);
            System.out.println(divisor);

            entrada = in.nextInt();
            
            if (entrada == 7) {
                loop = false;
                break;
            } else if (entrada > 0 && entrada < 8){
                System.out.println("Qual o valor que você deseja converter? ");
                valor = in.nextDouble();

                switch (entrada) {
                    case 1:
                        valorConvertido = converter.USDToARS(valor);
                        System.out.println("O valor de $%.2f USD corresponde ao valor final de $%.2f ARS.".formatted(valor, valorConvertido));
                        break;
                    case 2:
                        valorConvertido = converter.ARSToUSD(valor);
                        System.out.println("O valor de $%.2f ARS corresponde ao valor final de $%.2f USD.".formatted(valor, valorConvertido));
                        break;
                    case 3:
                        valorConvertido = converter.USDToBRL(valor);
                        System.out.println("O valor de $%.2f USD corresponde ao valor final de R$%.2f BRL.".formatted(valor, valorConvertido));
                        break;
                    case 4:
                        valorConvertido = converter.BRLToUSD(valor);
                        System.out.println("O valor de R$%.2f BRL corresponde ao valor final de $%.2f USD.".formatted(valor, valorConvertido));
                        break;
                    case 5:
                        valorConvertido = converter.USDToCOP(valor);
                        System.out.println("O valor de $%.2f USD corresponde ao valor final de $%.2f COP.".formatted(valor, valorConvertido));
                        break;
                    case 6:
                        valorConvertido = converter.COPToUSD(valor);
                        System.out.println("O valor de $%.2f COP corresponde ao valor final de $%.2f USD.".formatted(valor, valorConvertido));
                        break;
                }
            } else {
                System.out.println("Insira um valor válido.");
            }

            System.out.println("\n");
        }

    }
}
