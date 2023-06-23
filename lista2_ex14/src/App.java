import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe a segunda nota: ");
        double n2 = ler.nextDouble();
        System.out.println("");

        ler.close();

        double media = (n1 + n2) / 2;

        if(media >= 9.00 && media <= 10.00){
            System.out.printf("Sua primeira nota foi: %2.2f",n1);
            System.out.println("");
            System.out.printf("Sua segunda nota foi: %2.2f",n2);
            System.out.println("");
            System.out.printf("Sua media foi de: %2.2f",media);
            System.out.println("");
            System.out.printf("Conceito: A - Aprovado!");
        }

        if(media >= 7.50 && media <= 8.99){
            System.out.printf("Sua primeira nota foi: %2.2f",n1);
            System.out.println("");
            System.out.printf("Sua segunda nota foi: %2.2f",n2);
            System.out.println("");
            System.out.printf("Sua media foi de: %2.2f",media);
            System.out.println("");
            System.out.printf("Conceito: B - Aprovado!");
        }
        
        if(media >= 6.00 && media <= 7.49){
            System.out.printf("Sua primeira nota foi: %2.2f",n1);
            System.out.println("");
            System.out.printf("Sua segunda nota foi: %2.2f",n2);
            System.out.println("");
            System.out.printf("Sua media foi de: %2.2f",media);
            System.out.println("");
            System.out.printf("Conceito: C - Aprovado!");
        }

        if(media >= 4.00 && media <= 5.99){
            System.out.printf("Sua primeira nota foi: %2.2f",n1);
            System.out.println("");
            System.out.printf("Sua segunda nota foi: %2.2f",n2);
            System.out.println("");
            System.out.printf("Sua media foi de: %2.2f",media);
            System.out.println("");
            System.out.printf("Conceito: D - Reprovado!");
        }

        if(media <= 3.99 && media <= 0.00){
            System.out.printf("Sua primeira nota foi: %2.2f",n1);
            System.out.println("");
            System.out.printf("Sua segunda nota foi: %2.2f",n2);
            System.out.println("");
            System.out.printf("Sua media foi de: %2.2f",media);
            System.out.println("");
            System.out.printf("Conceito: E - Reprovado!");
        }
    }
}
