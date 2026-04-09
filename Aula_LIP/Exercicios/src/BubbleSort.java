public class BubbleSort {

    public static void main(String[] args) {
        
        int [] array = {8, 2, 3, 4, 6};

        int numero = array.length;

        for (int i = 0; i < numero-1; i++) {
            for (int j = 0; j < numero-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int valortemporario = array[j];
                    array[j] = array[j+1];
                    array[j+1] = valortemporario;
                }
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < numero; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}