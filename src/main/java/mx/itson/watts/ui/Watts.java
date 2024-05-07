/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.watts.ui;

import java.util.Scanner;
import mx.itson.watts.business.Operation;

/**
 *
 * @author alumnog
 */
public class Watts {
   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    int [] Watts  = {20415, 20563, 20753, 21065, 21615, 22105, 23016, 24148, 25008, 25653, 26205, 26326};
        System.out.println("ingrese el precio");
        
        double precio = s.nextDouble();
         Operation op = new Operation();
         double medirAnt = 0;
         
        for(int w = 0;w <= Watts.length-1;w++){
            int Mes = w+1;
            double consumoMes = Watts[w] - medirAnt;
            double cobroMes = op.consumo(consumoMes, precio);
            System.out.println("mes"+consumoMes+"coonsumo:"+Watts+"KWH"+precio);
        ///("hola";
        ///suvido al octogato 
        }



   















    }
}
