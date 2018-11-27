
package examen_sistemas_operativos;

public class Nodo {
    Auto carro;
    String color,marca,placa;
    Nodo nodo;
    Nodo anterior;
    Nodo siguiente; //enlaza los nodos (simplemente enlazados)
    Nodo cabeza; //(apunta al final de la lista para ir agregando los nodos) 
    
    
   public Nodo(Auto c){
		   carro=c;
        this.siguiente=null;
                
		}

}
