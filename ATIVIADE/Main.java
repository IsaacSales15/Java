package ATIVIADE;
import java.util.Scanner;
import ATIVIADE.Calc;

public class Main{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        Calc calc = new Calc();

        System.out.println("Coloque o primeiro número: ");
        calc.n1 = leia.nextInt();

        System.out.println("Coloque o segundo número: ");
        calc.n2 = leia.nextInt();

        System.out.println("Coloque a operação: ");
        calc.op = leia.next();

        calc.Operacao(calc.op,calc.n1, calc.n2);
        //calc.Soma(calc.n1, calc.n2);
        
        leia.close();
    }
}