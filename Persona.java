/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Info6
 */
public class Persona {
    
    private String Nombre;
    private  int Edad;
    private  int Dni;

    //Constructor con parametros
    
    public Persona() {
    }
    
    //consturctor

    public Persona(String Nombre, int Edad, int Dni) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dni = Dni;
    }

    //Setter

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }
    
    //Getter
    
    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getDni() {
        return Dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Dni=" + Dni + '}';
    }

    
    
}
