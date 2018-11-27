
package examen_sistemas_operativos;

public class Hilo_consumidor_salidas extends Thread {
   private Auto auto;
   private Arreglo_estacionamiento arreglo;
    
    public Hilo_consumidor_salidas(Arreglo_estacionamiento arreglo){
        this.arreglo=arreglo;
        this.auto=auto;
}
    
    
    public void run(){
    
        while(true){
            auto=arreglo.Obtener_Arreglo();
            
        }
    
    }
    
}
