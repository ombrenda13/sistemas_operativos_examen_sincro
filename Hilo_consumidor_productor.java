
package examen_sistemas_operativos;

import java.lang.reflect.Array;

public class Hilo_consumidor_productor extends Thread{
    private Auto auto;
    private Lista lista_coches;
    private Arreglo_estacionamiento arreglo;
    
    public Hilo_consumidor_productor(Lista lista,Arreglo_estacionamiento arreglo){
        this.auto=auto;
        this.lista_coches=lista;
        this.arreglo=arreglo;
    }
    
    public void run(){
   
        while(true){
               auto=lista_coches.ObtenerAuto();
              
               System.out.println("hilo:"+getName()+"\tingresando al estacionamiento:"+auto.color_auto+"\t"+auto.marca_auto+"\t"+auto.placa);
              
               arreglo.Llenar_Arreglo(auto);
             //  arreglo.Imprimir();
              
        }
    
        
        
        
    }
}
