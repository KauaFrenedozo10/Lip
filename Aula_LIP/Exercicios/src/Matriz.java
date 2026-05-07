public class Matriz {
    public static void main(String[] args) {
        
        int [][] tabela = new int[3][3];

        for (int x = 0; x < 3; x++) {
            for(int y = 0; y< 3; y++) {
                tabela[x][y] =(int) (Math.random() * 10) ;
                

            }
        }
        for (int x = 0; x < 3; x++) {
            for(int y = 0; y< 3; y++) {
                System.out.print("|" + tabela[x][y] + "|"); 

            }

            System.out.println();

        }
    }
}
