import java.util.Scanner;

public class Exec2 {

    public static boolean fib(int num){
        int a = 0;
        int b = 1;
        while (b < num){
            b = a + (a = b);
        }
        return b == num;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        int n = ler.nextInt();

        if(fib(n)){
            System.out.println("Numero pertence a sequencia de fibonacci");
        }else{
            System.out.println("Numero NAO pertence a sequencia de fibonacci");
        }
    }
}
