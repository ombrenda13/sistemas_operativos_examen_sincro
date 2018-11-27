
package examen_sistemas_operativos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Arreglo_estacionamiento {
    ArrayList arreglo=new ArrayList(10);
    Auto array[]=new Auto[10];
    boolean disponible=false;
    int espacio=10;
    int contador=0;
    public synchronized void Llenar_Arreglo(Auto auto){
        
        while(disponible==true){//no se ha consumido un valor
        
                try {
                wait(); //se pone a dormir y cede el monitor
                } catch (InterruptedException e) {}
        }
        if(arreglo.size()<10){
         arreglo.add(auto);
         System.out.println("ESTACIONAMIENTO:"+"\tcolor:"+auto.color_auto+"\tmarca:"+auto.marca_auto+"\tplaca:"+auto.placa);
       
         
         espacio=espacio-1;
                 System.out.println("ESPACIO DISPONIBLE:"+ espacio);
        for(int a=0;a<arreglo.size();a++){
          
           System.out.println("ESTACIONAMIENTO:"+"\tcolor:"+((Auto)arreglo.get(a)).color_auto+"\tmarca:"+((Auto)arreglo.get(a)).marca_auto+"\tplaca:"+((Auto)arreglo.get(a)).placa);
        }
        }
        
        else{
            System.out.println("-------------ESTACIONAMIENTO LLENO--------");
        }
        
         // System.out.println("ME ESTAN AGREGANDO:"+"color:"+((Auto)arreglo.get(0)).color_auto+"\tmarca:"+((Auto)arreglo.get(0)).marca_auto+"\tplaca:"+((Auto)arreglo.get(0)).placa);
           disponible=true;     
           notifyAll();
          
    }
        
    public void Imprimir(){
        for(int a=0;a<arreglo.size();a++){
          
            System.out.println("ESTACIONAMIENTO:"+"\tcolor:"+((Auto)arreglo.get(a)).color_auto+"\tmarca:"+((Auto)arreglo.get(a)).marca_auto+"\tplaca:"+((Auto)arreglo.get(a)).placa);
        }
    
    }
   
    public synchronized Auto Obtener_Arreglo(){
        Auto auxiliar=new Auto();
            while(disponible==false){ //no hay nada 
                try {
                wait(); //se pone a dormir y cede el monitor
                } catch (InterruptedException e) {}
        }
             Random r = new Random();
            
       int random=(r.nextInt(10));
       
       if(random>0 && random<=arreglo.size() && random!=arreglo.size()){
         
               if(!(arreglo.get(random).equals(""))&& random!=arreglo.size()){
                   
                 System.out.println("SALIENDO"+"\tcolor:"+((Auto)arreglo.get(random)).color_auto+"\tmarca:"+((Auto)arreglo.get(random)).marca_auto+"\tplaca:"+((Auto)arreglo.get(random)).placa);
                    arreglo.remove(random);
                    espacio=espacio+1;
                   System.out.println("espacio agregado:"+espacio);
               }   }
            disponible=false;
            notifyAll();
          return auxiliar;
    }
}
