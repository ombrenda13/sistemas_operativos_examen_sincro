
package examen_sistemas_operativos;

public class Lista {
    public Nodo inicio,fin;
    boolean disponible=false;
    public Lista(){
    
    inicio=null;
    fin=null;
    }
 
    public boolean estaVacia(){
    
    	if(inicio==null){
        	return true;
    
    	}else {return false;}
    
    }
     
    //región crítica 
    public synchronized void agregarFinal(Auto c){
        while(disponible==true){ //el consumidor aun no obtiene el coche asi que se mantiene dormido hasta que es consumido por alguien
            try {
                wait(); //se pone a dormir y cede el monitor
                } catch (InterruptedException e) {}
        }
        
		if(!estaVacia()){
                fin.siguiente=new Nodo(c);
                fin=fin.siguiente;
                
            }else{
                  inicio=fin=new Nodo(c); 
             }
               
            disponible=true; //hay un nodo ingresado a la lista    
            notifyAll(); //avisa que hay un nodo disponible
	}
       
    
	public void mostrarFila(){
	Nodo recorrer=inicio;
	while(recorrer!=null){
		System.out.println("color:"+recorrer.carro.color_auto+"\tmarca:"+recorrer.carro.marca_auto+"\tplaca:"+recorrer.carro.placa);
		
                recorrer=recorrer.siguiente;
	}
        
        
	}
        
      public synchronized Auto ObtenerAuto(){ //este metodo lo usa el consumidor 
          while(disponible==false){
          try {
                wait(); //se pone a dormir y cede el monitor
                } catch (InterruptedException e) {}
          }
          
          
                Auto tem=inicio.carro;
                if(inicio==fin){
                    inicio=null;
                    fin=null;
                }else{
                    inicio=inicio.siguiente;

                } 
                disponible=false;//ya no hay nodo porque ya lo consumio
                notifyAll();
                    return tem;
                   
                  }

    
    
}