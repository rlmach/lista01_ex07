import java.util.Scanner;
import java.lang.Math;

public class App {
        
    public static void main(String[] args) {

        int lado;
        double area;
        double dobro;
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um lado: ");
        lado = sc.nextInt();
        sc.close();
    
        area = Math.pow(lado, 2);
        dobro = area * 2;
    
        System.out.println("A área desse quadrado é " + area);
        System.out.println("E o dobro dela é " + dobro);
            
    }
        
}
    