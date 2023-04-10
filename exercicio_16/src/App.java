import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.        
        int metrosQuadrados;
        int litrosTinta;
        int latasTinta;
        double precoTotal;

        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
            metrosQuadrados = teclado.nextInt();

            litrosTinta = (int) Math.ceil(metrosQuadrados / 3.0);
            latasTinta = (int) Math.ceil(litrosTinta / 18.0);
            precoTotal = latasTinta * 80.0;

            System.out.printf("Você precisará comprar %d latas de tinta, com um total de R$%.2f.%n", latasTinta,
                    precoTotal);
        }
    }
}