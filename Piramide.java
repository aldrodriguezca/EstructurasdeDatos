/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author ADRC
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, x;
        int y=1;
        System.out.println("Por favor digite el número de filas que desea tenga el triangulo");
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        x = n - 1;
        for (int i = 1; i <= n; i++) {

            for (int j = x; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=y;k++){
                System.out.print("*");
            }
             x-=1;
            y+=2;
            System.out.print("\n");
        }
        
        
       

    }
}
