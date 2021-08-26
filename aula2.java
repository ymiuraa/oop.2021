package Java;

import java.util.Arrays;
import java.util.Scanner;

public class aula2 {
    public static void main(String[]args) {
    
    Scanner sc = new Scanner(System.in);
    int[] num = new int[10];
    

    for(int i=0; i<num.length; i++)
    {
        System.out.println("Entre com o numero " + (i+1) + ":");
        num[i] = sc.nextInt();

    }
    Arrays.sort(num); 
    
    for (int n : num){
        System.out.println(n);
    System.out.println();        
    }
    sc.close();
}
}