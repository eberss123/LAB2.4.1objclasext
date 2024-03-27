
package Bicicleta;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Bicicleta bici1= new Bicicleta();
        Scanner lectura= new Scanner(System.in);
         System.out.println("ingrese la marca de la bicicleta:");
         String marca= lectura.nextLine();
         bici1.setMarca(marca);
         System.out.println();
        System.out.println("ingrese el material del cuadro:");
        String material= lectura.nextLine();
        bici1.cuadro1.setMaterial(material);
        System.out.println("");
        System.out.println("ingrese el tipo de la rueda");
        String tipo= lectura.nextLine();
        bici1.rueda1.setTipoLlanta(tipo);
        System.out.println("");
        System.out.println("los datos de la bicicleta y de sus componentes son:\n");
        System.out.println("marca: " + bici1.getMarca());
        System.out.println("material cuadro: " + bici1.cuadro1.getMaterial());
        System.out.println("tipo de rueda: " + bici1.rueda1.getTipoLlanta());
        
         
        
    }
    
    
}
