
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        boolean cnt = true;
        do {            
            try {
                n = sc.nextInt();
                if(n<2||n>10) throw new Exception();
                if(n%2==0) System.out.println("That is even number");
                else System.out.println("That is odd number");
            } catch (Exception e) {
                System.out.println("n is not whithin range 2 to 10");
                cnt = false;
            }
        } while (cnt!=false);
    }
}
