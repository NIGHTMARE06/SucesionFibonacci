package sucesion;

import javax.swing.JOptionPane;

/**
 *
 * @author n1ght_m4re
 */
public class SucesionFibonacci {
    public static void main(String[] args) {
        int max = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros se mostraran?"));
        int[] numbers = new int[max+2];
        numbers[0] = 1;
        System.out.println("1: " + numbers[0]);
        numbers[1] = 1;
        System.out.println("2: " + numbers[1]);
        
        for(int i = 0; i < max-2; i++) {
            numbers[i+2] = numbers[i] + numbers[i+1];
            System.out.println((i+3) + ": " + (numbers[i+2]));
        }
    }
    
}
