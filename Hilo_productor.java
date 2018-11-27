
package examen_sistemas_operativos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo_productor extends Thread {
    
	private Lista lista_coches; 
		String modelo,color;
                int numero_autos;
                int i=0;
		public Hilo_productor (Lista carros,int num_autos) {
			lista_coches=carros;
                        this.numero_autos=num_autos;
                        this.i=i;
		}
		
		public void run() {
                     setPriority(1);
			while(i<numero_autos){
				Auto carro=new Auto();
                                lista_coches.agregarFinal(carro);
                                System.out.println();
                               System.out.println("hilo:"+getName()+"\tcarro formado:"+carro.color_auto+"\t"+carro.marca_auto+"\t"+carro.placa);
                        i++;
                        
                        } 
                      
}
}
