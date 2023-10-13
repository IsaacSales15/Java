import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Coloque o tamanho da escada: ");
        int altura = leia.nextInt();

        for(int i = 0; i < altura; i++){

            for(int j = 0; j < altura; j++){

                if(altura - i - 1 <= j){

                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            for(int w = 0; w < altura; w++){

                if(w <= i){

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println(); 
        }

        leia.close();
    }
}
