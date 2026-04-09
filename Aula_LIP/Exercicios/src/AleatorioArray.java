import java.util.Scanner;

public class AleatorioArray {
    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Tente acertar com algum número de 1 ao 100: ");
        int numeroSorteado = scan.nextInt();

        for (int i = 0; i < array.length; i++) {
             
            int numeroAleatorio = (int) (Math.random() * 100) + 1;
            array[i] = numeroAleatorio;

            System.out.print( " | "+ array[i]+ " ");
            if (numeroSorteado == array[i]) {
                System.out.println(" Encontrado");
               
                return;
            }
        }

        System.out.print("Não encontrado");
        
        scan.close();

    }
}