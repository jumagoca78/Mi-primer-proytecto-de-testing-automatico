/*
 * programa que calcula el valor mas grande de un arreglo
 */

 public class ElMasGrande{

    public int elMasGrande (int arreglo []){
        
        //lanzar excepcion si el arreglo esta vacio
        if (arreglo.length == 0){
            throw new IllegalArgumentException("El arreglo no puede estar vacio");
        }
        int max = arreglo[0];
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] > max){
                max = arreglo[i];
            }
        }
        return max;

    }
 }