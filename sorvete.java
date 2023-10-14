import java.util.Scanner;

public class sorvete {
     public static void main(String[] args){
        int quantidade = 0, sabor = 0;

        System.out.println("Ola, Seja bem-vindo(a)."); 
        System.out.println("Escolha um dos sabores abaixo:."); 
        System.out.println("(1)Chocolate     (2)Morango");
        
        Scanner scanner = new Scanner (System.in);
        sabor = scanner.nextInt();

        if (sabor == 1){
            System.out.println("Porfavor, escolha a quantidade de bolas de 1 ate 5.");
                  quantidade = scanner.nextInt();    
                  
            if (quantidade > 3 && quantidade <= 5 )
            System.out.println("Voce obteve 10% de desconto. Parabens!!");

            if (quantidade >= 6)
            System.out.println("Quantidade de bolas ultrapassa o limete do copo.");
            
            else{
                System.out.println("Voce obteve 5% de desconto. Parabens!");
            }
        }
        else {
            System.out.println("Sorvete sem desconto.");
        }
        
     }
}
