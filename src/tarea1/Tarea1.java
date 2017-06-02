package tarea1;

import da.ListaSimple;

/**
 *
 * @author Johan Herrera
 */
public class Tarea1 {

    public static void main(String[] args) {
        ListaSimple ls = new ListaSimple();

        ls.add("a");
        ls.add("b");
        ls.add("l");
        
//        ls.invertirLista();
       
        if(!ls.isEmpty())
        System.out.println("Valor de la cabeza: "+ls.getCabeza().getDato());
        System.out.println(ls.valoresMenores());
        System.out.println("Tamaño de la lista: "+ls.size());
        System.out.println("Contador: " + ls.getCont());

        ls.mostrarLista();
    }

}
