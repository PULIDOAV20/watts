/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.watts.business;

/**
 *
 * @author alumnog
 */
public class Operation {
    
    
    int Medicion = 0;
   public double consumo (double consumoMes,double precio){
       double cobroMes = consumoMes * precio;
       return cobroMes;
   }     
    }

