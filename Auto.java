
package examen_sistemas_operativos;

import java.util.*;

public class Auto {
    
        int numero;
        String marca_auto,color_auto,placa;
        String placas_letras;
        int placas_num1;
        int placas_num2;
        String colores[]={"azul","verde","rojo","amarillo","blanco","negro","gris","naranja"};
        String marcas[]={"Audi","BMW","Fiat","Ford","Honda","Volkswagen","Nissan","Jeep","Mazda","Seat","Renault","Tesla","Volvo","Toyota"};
        String letras[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","0","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
    public Auto(){
       Random r = new Random();
       int random=(r.nextInt(colores.length));
       int random2=(r.nextInt(marcas.length));
       int random3=(r.nextInt(letras.length));
       int random4=(r.nextInt(letras.length));
       int random7=(r.nextInt(letras.length));
       int random5=(r.nextInt(99));
       int random6=(r.nextInt(99));
       this.color_auto=colores[random].toString();
       this.marca_auto=marcas[random2].toString();
       this.placa=(letras[random7]+letras[random3]+letras[random4]+"-"+random5+"-"+random6);
        
       
        
        
}
    
    
}
