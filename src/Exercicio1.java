import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double n1 = sc.nextDouble();
        System.out.println("Digite o Segundo número");
        double n2 = sc.nextDouble();
        if(n1 == n2){
            System.out.println("São idênticos");
        }
        else{
            System.out.println("Não são idênticos");
        }
    }
}
