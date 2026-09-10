/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.estructura4c;

import Unidad1.tdaCuentaBancaria;

/**
 *
 * @author mendo
 */
public class Estructura4C {

    public static void main(String[] args) {
        System.out.println("Banca UTHH");
        System.out.println("Ejemplo de TDA");
        
        tdaCuentaBancaria cuenta= new tdaCuentaBancaria(5000, "5574235698741255", "Luis Alberto Mendoza San Juan");
        
        cuenta.Deposito(300);
        if (cuenta.Deposito(50)==true){
            System.out.println("Deposito Exitoso");
        }else{
            System.out.println("Algo anda mal con tu deposito ");
        }        
        
        System.out.println("Tu saldo es : "+cuenta.ConsultaSaldo());
        
        
    }
}
