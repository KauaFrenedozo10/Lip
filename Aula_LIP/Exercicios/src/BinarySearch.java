import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int [] array = new int[10];
        

       

        System.out.println(array);
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Insira um numero");
        int numeroAl = scan.nextInt();

        Arrays.sort(array);

       

        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + fim/2;

         if (array[meio] == numeroAl) {
                System.out.println("Encontrado");
                System.out.println(meio);
                break;
            }else { 
                System.out.println("n econtrado");
                System.out.println(meio);
                break;
            }  

        }
         
        

    }
}



