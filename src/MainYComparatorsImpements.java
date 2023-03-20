/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EdadComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Usuario u1 = (Usuario) o1;
        Usuario u2 = (Usuario) o2;
        return u1.getEdad() - u2.getEdad();
    }

    public boolean equals(Object o) {
        return this == o;
    }
}



class NombreComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        Usuario u1 = (Usuario) o1;
        Usuario u2 = (Usuario) o2;
        return u1.getNombre().compareTo(u2.getNombre());
    }

    public boolean equals(Object o) {
        return this == o;
    }

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        lista.add(new Usuario("Andrea", 11));
        lista.add(new Usuario("Barbara", 2));
        lista.add(new Usuario("Aarmen", 3));
        lista.add(new Usuario("Deborah", 44));
        System.out.println(lista);
        System.out.println("\n Ahora ordenados por nombre...");
        Collections.sort(lista, new NombreComparator());
        //metodo que imprime la lista
        System.out.println(lista);
        System.out.println("\n y ahora ordenados por edad...");
        Collections.sort(lista, new EdadComparator());
        //metodo que imprime la lista
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);

    }
}
