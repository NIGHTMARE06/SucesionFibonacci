import javax.swing.JOptionPane;

/**
 *
 * @author n1ght_m4re
 */
public class SucesionFibonacci {
    public static void main(String[] args) {
        int max = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros se mostraran?"));
        long[] numbers = new long[max];
        numbers[0] = 0;
        numbers[1] = 1;
        
        for(int i = 2; i < max; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }

        for(int i = 0; i < max; i++) {
            System.out.println((i+1) + ": " + numbers[i]);
        }
    }
}
