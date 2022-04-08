import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[20];
        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite o núemro");
            numero[i] = sc.nextInt();
        }
        for(int i = 0; i < numero.length; i++){
            if(numero[i] > 8){
                System.out.println();
                System.out.println("Números maiores que 8");
                System.out.println(numero[i]);
            }
        }
    }
}
