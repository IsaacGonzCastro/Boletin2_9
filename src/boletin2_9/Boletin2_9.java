
package boletin2_9;

import java.util.Scanner;

public class Boletin2_9 {

    public static void main(String[] args) {
    //entrada por teclado
       int  billetes100 , billetes20 , billetes5, monedas1;
    Scanner obx = new Scanner(System.in);
    System.out.println("inroduce billetes de 100 =");
    billetes100 = obx.nextInt();
    billetes100 =billetes100 * 100;
    System.out.println("introduce billetes de 20 =");
    billetes20 = obx.nextInt();
    billetes20 = billetes20 * 20;
    System.out.println("introduce billetes de 5 =");
    billetes5 = obx.nextInt();
    billetes5 = billetes5 * 5;
    System.out.println("introduce moedas de 1 =");
    monedas1 = obx.nextInt();
    monedas1 = monedas1 * 1 ;
    System.out.println("Dinero total ="+ (billetes100 + billetes20 +billetes5 + monedas1)+ "Euros");  
    }
    
}
