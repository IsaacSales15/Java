import java.util.Scanner;

public class index{
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        float[] numero = new float[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Digite a nota do aluno: ");
            numero[i] = leia.nextFloat();
        }

        float media = (numero[0] + numero[1] + numero[2])/3;
        
        if (media >= 7){
            System.out.println("Aprovado! A média do aluno é: " + media);
        
        }else {
            System.out.println("Reprovado! A média do aluno é: " + media);
        }

        leia.close();
    }
}