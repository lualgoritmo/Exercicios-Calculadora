import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[4];
        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite o núemro");
            numero[i] = sc.nextInt();
        }
        System.out.println("-------------------------------------------------");
        for(int i = 0; i < numero.length; i++){
            if(numero[i] %2 == 0){
                System.out.println();
                System.out.println("Números pares");
                System.out.println(numero[i]);
            }
        }
    }
}
