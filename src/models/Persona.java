package models;

public class Persona {

    private String nombre;
    private int age;

    public Persona(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }


    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }


        @Override
    public String toString() {
        return "Persona [nombre = " + nombre + ", age = " + age + "]";
    }


        
}
