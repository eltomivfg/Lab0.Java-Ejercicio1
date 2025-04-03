/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Info6
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1= new Persona();
        p1.setNombre("Jose");
        p1.setEdad(80);
        p1.setDni(40256362);
        
        Persona p2= new Persona("Pepe",81,40659125);
        
        System.out.println("Nombre: "+ p1.getNombre());
        System.out.println("Edad: "+ p1.getEdad());
        System.out.println("Dni: "+ p1.getDni());
        
        System.out.println(p2);
    }
    

}

    
