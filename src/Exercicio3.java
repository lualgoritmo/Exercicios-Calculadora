import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dois números");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x < y){
            System.out.println("Digite o terceiro número");
            int z = sc.nextInt();
            System.out.println("Faz parte do intervalor entre" + x + " e " + y + ": " + z);
        }
        else{
            System.out.println("Não tem intervalo");
        }
    }
}
