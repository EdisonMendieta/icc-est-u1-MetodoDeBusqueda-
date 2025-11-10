package views;

import models.Persona;

public class ShowConsole {


    public void showPersonResult(Persona persona, String name){
        System.out.println( 
            persona !=null
                    ? "Se encontro a " + persona 
                    : "no se encontro la persona " + name 

        );

    }

    public void showPersonResult(Persona persona, int age){
        System.out.println( 
            persona !=null
                    ? "Se encontro a " + persona 
                    : "no se encontro la persona " + age

        );

    }
    
    public void printArray(int[] numeros){
        System.out.print("[ ");
        for ( int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println(" ]");

    }

    public void printResultado(int resultado, int clave){
        if (resultado == -1) {
            System.out.println("ERROR -> numero {"+ clave +"} no se a encontrado");
        }else{
            System.out.println("Se encontro "+ clave +" en la posicion " + resultado);
        }
    }

    public void printResultado(Integer resultado, int clave){
        if (resultado == null) {
            System.out.println("ERROR -> numero {" + clave + "} no encontrado");
        }else{
            System.out.println("numero {" + clave + "} se a encontrado");
        }
    }
}
