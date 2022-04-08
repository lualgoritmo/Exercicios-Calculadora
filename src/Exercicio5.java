import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] semana = new int[7];
        for(int i = 0; i < semana.length; i++){
            System.out.println(i + 1);
            if((i + 1) == 1){
                System.out.println("Domingo");
            }
            else if((i + 1) == 2){
                System.out.println("Segunda");
            }
            else if((i + 1) == 3){
                System.out.println("Terça");
            }
            else if((i + 1) == 4){
                System.out.println("Quarta");
            }
            else if((i + 1) == 5){
                System.out.println("Quinta");
            }
            else if((i + 1) == 6){
                System.out.println("Sexta");
            }
            else if((i + 1) == 7){
                System.out.println("Sábado");
            }
        }
    }
}
