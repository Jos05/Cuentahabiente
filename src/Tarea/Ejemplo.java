/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author usuario
 */
public class Ejemplo {
public static void main(String args[]){
         
        Tareacuentahabiente[] cuentas = new Tareacuentahabiente[5];   
        cuentas[0]=new Tareacuentahabiente("oofd21345","Ruben Rojas", 75000);
        cuentas[1]=new Tareacuentahabiente("uids10234","Nestor Lopez", 43000);
        cuentas[2]=new Tareacuentahabiente("yusa09123","Karla Roman", 50000);
        cuentas[3]=new Tareacuentahabiente("tyal98012","Veronica Padilla", 49999);
        cuentas[4]=new Tareacuentahabiente("rtlk87901","Guillermo Becerra", 50001);
        
        for (int i = 0; i < cuentas.length; i++) {
            
            cuentas[i].retirarDinero(10000);
            System.out.println(cuentas[i]);
            if(cuentas[i].getBalance()<=50000){
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es REGULAR");
            }else{
                System.out.println("La cuenta de " +cuentas[i].nombre);
                System.out.println(" es PREMIUM");               
            }
        }
}
}    

