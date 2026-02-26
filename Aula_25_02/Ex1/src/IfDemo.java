public class IfDemo {
    public static void main(String[] args) {
        int nota1 = 4;
        int nota2 = 56;
        int nota3 = 7;


        // Comparação entre Nota 1 e Nota 2
        if (nota1 > nota2) {
            System.out.println("Nota1 é maior que Nota2 ");
        }
        // Comparação entre Nota2 e Nota3 
        else if (nota1 < nota2) {
            System.out.println("Nota 1 é maior que Nota3");
        }
         else if (nota2 > nota3) {
            System.out.println("Nota 1 é maior que Nota3");
        }
         else if (nota2 < nota3) {
            System.out.println("Nota 1 é maior que Nota3");
        }
         else if (nota1 > nota3) {
            System.out.println("Nota 1 é maior que Nota3");
        }

    }
    
}