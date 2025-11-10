package controller;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda{

    private ShowConsole showConsole;
    private int[] arreglo;

    public MetodosBusqueda() {
        this.arreglo = new int[] {10,11,-2,5,6,8,15,22};
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);

        int result1 = busquedaLineal(5);
        showConsole.printResultado(result1, 5);

        int result2 = busquedaLineal(-2);
        showConsole.printResultado(result2, -2);

        int result3 = busquedaLinealWhile(20);
        showConsole.printResultado(result3, 20);

        //buscar 100
        Integer result4 = busquedaLinealObjeto(100);
        showConsole.printResultado(result4, 100);

        //buscar 10 
        Integer result5 = busquedaLinealObjeto(10);
        showConsole.printResultado(result5, 10);

    }

    //retorna la posicion del valor buscado
    public int busquedaLineal(int clave){

        for (int i = 0; i < arreglo.length; i++) {
            if (clave == arreglo[i]){
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealWhile(int clave){
        int i = 0;
        while (i < arreglo.length) {
            if (clave == arreglo[i]){
                return i;
            }
            i++;
        }
        return -1;
    }

    //retorna el objeto buscado cc null
    public Integer busquedaLinealObjeto(int clave){
        for (int i = 0; i < arreglo.length; i++) {
            if (clave == arreglo[i]){
                return arreglo[i];
            }
        }
        return null;
    }

    public Persona searchPersonaByName(Persona[] personas, String name){
        
        for (Persona persona : personas) {
            if (persona.getNombre().equals(name)) {
                return persona;
            }
        }
        return null;
        
    }
    //encontrar una persona que sea mayor de : age 
    // Y la edad sea impar
    public Persona findPersonaByAge(Persona[] personas, int age){

        for (Persona persona : personas) {
            if (persona.getAge() > age && persona.getAge() % 2 != 0) {
                return persona;
            }        
        }
        return null;
    }
}