/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author mendo
 */
public class tdaCuentaBancaria {
    //Atributos de una cuenta bancaria 
    private float Saldo;
    private String NumCuenta;
    private String Titular;
    
    //creamos nuestros contructores
    //contructor por default
    public tdaCuentaBancaria(){
        Saldo=0.0f;
        NumCuenta="****************";
        Titular="Gesst001";
    }
    //contructor parametrizado
    public tdaCuentaBancaria(float saldo, String cuenta, String titular){
        if(saldo<0){
            Saldo=0;
        }else{
            Saldo=saldo;
        }
        NumCuenta=cuenta;
        Titular=titular;
    }
    //Constructor copia 
    public tdaCuentaBancaria(tdaCuentaBancaria copia ){
        Saldo=copia.Saldo;
        NumCuenta=copia.NumCuenta;
        Titular=copia.Titular;
    }
    //Constructor para crear cuentas sin saldo inicial
    public tdaCuentaBancaria(String cuenta, String Titular){
        Saldo=0.0f;
        NumCuenta=cuenta;
        this.Titular=Titular;
    }
    
    //Propiedades que se pueden realizar (Saldo no, cuenta get, Titular get)
    public String getCuenta(){
        return NumCuenta;
    }
    
    public String getTitular(){
        return Titular;
    }
    
    //Metodos 
    public boolean Deposito(float cantidad){
        if(cantidad<=0)
        {
            //throw  new IllegalArgumentException("No puedes Depositar cantidades negativas ni cero");
            return false;
        }
        Saldo=Saldo+cantidad;
        return true;
    }
    
    public boolean Retiro(float cantidad){
        if(cantidad<=0){
            return false;
        }
        
        if(cantidad>Saldo){
            return false;
        }
        
        Saldo=Saldo-cantidad;
        return true;
    }
    
    public float ConsultaSaldo(){
        return Saldo;
    }
}
