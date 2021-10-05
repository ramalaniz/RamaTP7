
package pruebaarreglo;

public class Arreglo {
    
    static void sumarLista(int[] arregloUnid){
        int suma=0;
        double cantidad=0;
        double promedio=0;
        
        for(int r=0; r<arregloUnid.length; r++){
            suma += arregloUnid[r];
            cantidad++;
        }
        promedio = suma/cantidad;
        System.out.println("La suma del arreglo es: "+suma);
        System.out.println("El promedio del arreglo es: "+promedio);
    }
    
    static void buscarMayor(int[][] arregloBidi){
        int masGrande=0;
        
        for(int i=0; i<arregloBidi.length; i++){
            for(int l=0; l<arregloBidi.length; l++){
                if(arregloBidi[i][l] > masGrande){
                    masGrande = arregloBidi[i][l];     
                }
            }
        }
        System.out.println("El entero mas grande del arreglo es: "+masGrande);
    }
    
    static void cuentaVocales(String vocal){
        int cantiVocales=0;
        
        for(int j=0; j<vocal.length(); j++) {
            if(vocal.charAt(j) == 'a' || vocal.charAt(j) == 'e' || vocal.charAt(j) == 'i' || vocal.charAt(j) == 'o' || vocal.charAt(j) == 'u'){
                cantiVocales++;   
            }
        }
        System.out.println("La cantidad de vocales de la cadena es: " +cantiVocales);
    }
    
    static void cuentaCaracter(String cadena, char caracter){
        int repetido=0;
        
        for(int c=0; c<cadena.length(); c++){
            if(cadena.charAt(c)== caracter){
                repetido++;
            }
        }
        System.out.println("El caracter " +"'"+caracter+"'" +" se repite en la cadena "+repetido +" veces"); 
    }
    
}
