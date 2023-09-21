
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
public class Sort {
    public static void main(String[] args) {
        System.out.print("Input number of the arrays:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Input the elements of the arrays: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The arrays affter Sorted:");
        for(int i=0;i<n-i;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
