/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author BD
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int cout;
        System.out.println("insira um numero");
        num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            cout = 0;
            for (int x = 1; x <= i; x++) {

                if (i % x == 0) {
                    cout++;
                }
            }
            if (cout == 2) {
                System.out.println(i + " é primo");
            }

        }

    }

}
