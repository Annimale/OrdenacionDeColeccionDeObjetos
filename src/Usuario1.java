
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class Usuario1 implements Comparable {

    private String nombre;
    private int edad;

    Usuario1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String toString() {
        return nombre + " (" + edad + ")";
    }

    public int compareTo(Object o) {
        Usuario1 otroUsuario = (Usuario1) o;
        //podemos hacer esto porque String implementa Comparable
        //return nombre.compareTo(otroUsuario.getNombre());
        return edad- (otroUsuario.getEdad());// Esto sería para comporar edad
        
    }

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        System.out.println(lista);
        System.out.println("\n Ahora ordenados...");
        Collections.sort(lista);
        //metodo que imprime la lista
        System.out.println(lista);

    }

}
