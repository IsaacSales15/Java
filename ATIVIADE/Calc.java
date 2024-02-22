package ATIVIADE;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Calc {
//Questão 1
    public int n1, n2;
    public String op;

    public void Soma(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;

        System.out.println("O resultado é " + (n1 + n2));
    }


//Questão 2

    public void Operacao(String op, int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;

        if (op.equalsIgnoreCase("+")) {
            System.out.println("O resultado é " + (n1 + n2));
        }
        else if (op.equalsIgnoreCase("-")){
            System.out.println("O resultado é " + (n1 - n2));
        }
        else if (op.equalsIgnoreCase("*")){
            System.out.println("O resultado é " + (n1 * n2));
        }
        else if (op.equalsIgnoreCase("/")){
            System.out.println("O resultado é " + (n1 / n2));
        }
        else {
            System.out.println("Inválido");
        }
    }
// Questão 3

}

