import java.util.Scanner;

public class MaquinaCafeSwitch {
    public static void main(String[] args) {
        
        final int LEITE_LIMITE = 4000;
        final int AGUA_LIMITE = 2000;
        final int CAFE_LIMITE = 1550;
        final double precoCappucino = 2.50;
        final double precoPingado = 2.80;
        final double precoCafe = 3.0;
        int leite = LEITE_LIMITE;
        int cafe = CAFE_LIMITE;
        int agua = AGUA_LIMITE;
        Scanner scan = new Scanner(System.in);
        int opcaocafe;
        do {
            System.out.println("Menu");
            System.out.println("**************************************");
            System.out.println("0-Sair 1-Cappucino 2-Pingado 3-Café ");
            System.out.println("**************************************");
        
            opcaocafe = scan.nextInt();

            if (opcaocafe == 2) {
            System.out.println("Saindo");
        }
         
        switch (opcaocafe) {
            
            case 1:
                if (agua >= 200 && leite >= 100) {
                    agua -= 200;
                    leite -= 100;
                    System.out.println("Fazendo Cappucino. Preço: " + precoCappucino);
                }else {
                    System.out.println("Está sem recursos para fazer o cappucino");
                    break;
                }
                 break;
            case  2:
                 if (agua >= 200 && leite >= 100) {
                    agua -= 200;
                    cafe -= 100;

                    System.out.println("Fazendo Pingado");
                }else {
                    System.out.println("Está sem recursos para fazer o pingado. Preço: " +precoPingado);
                    break;
                }
                break;
                
            case 3:
                 if (agua >= 200 && leite >= 100) {
                    agua -= 200;
                    leite -= 100;
                    cafe -= 50;
                    System.out.println("Fazendo Cafe");
                }else {
                    System.out.println("Está sem recursos para fazer o cafe. Preço: " +precoCafe);
                    break;
                }
                
            case 0:
                System.out.println("Agua: " + agua + " Leite: " + leite + " Café: "+ cafe );
                break;

            default:
                break;
        }
     } while (opcaocafe != 0);
     scan.close();
    }
}
