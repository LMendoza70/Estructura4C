/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author mendo
 */
public class tdaHora {
    //Atrubutos
    private int hora;
    private int minuto;
    private int segundo;
    
    //constantes
    private final int MINUTOS_HORA=60;
    private final int SEGUNDOS_MINUTO=60;
    private final int HORAS_DIA=24;
    //metodos
        //constructores
    public tdaHora(){
        hora=0;
        minuto=0;
        segundo=0;
    }
    
    public tdaHora(int h, int m, int s){
        hora=(h>=0 && h<=23)?h:0;
        minuto=(m>=0 &&m<=59)?m:0;
        segundo=(s>=0 && s<=59)?s:0;
    }
    
    public tdaHora(tdaHora x){
        hora=x.hora;
        minuto=x.minuto;
        segundo=x.segundo;
    }
        //getters y seters
    public int getHora(){
        return hora;
    }
     
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setHora(int h){
        hora=(esHoraValida(h))?h:0;
    }
    
    public void setMinuto(int m){
        if(esMinutoValido(m)==true)
            minuto=m;
        else
            minuto=0;
    }
    
    public void setSegundo(int s){
        segundo=(esSegundoValido(s)==true)?s:0;
    }
        //metodolos logicos 
    public boolean esHoraValida(int h){
        if(h>=0 && h<=23){
            return true;
        }else{
        return false;
        }
    }
    
    public boolean esMinutoValido(int m){
        if(m>=0 && m<=59){
            return true;
        }
        return false;
    }
    
    public boolean esSegundoValido(int s){
        if(s>=0 && s<=59)
            return true;
        return false;
    }
    
    @Override
    public String toString(){
        String res="";
        res=(hora<10)?"0"+hora+":":hora+":";
        res=(minuto<10)?res+"0"+minuto+":":res+minuto+":";
        res=(segundo<10)?res+"0"+segundo:res+segundo;
        return res;
    }
    
    public boolean esIgual(tdaHora x){
        if(hora==x.hora && minuto==x.minuto && segundo==x.segundo){
            return true;
        }else{
            return false;
        }
    }
    
    public void sumarSegundos(int s){
        int segundos= hora*3600;
        segundos=segundos+minuto*60;
        segundos=segundos+segundo+s;
        
        hora= segundos/3600;
        segundos=segundos%3600;
        minuto=segundos/60;
        segundo=segundos%60;
    }
}
