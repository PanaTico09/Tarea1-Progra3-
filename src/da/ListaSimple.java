package da;

/**
 *
 * @author Johan Herrera
 */
public class ListaSimple {

    private Nodo cabeza;
    private int size;
    private int cont;

    public ListaSimple() {
        this.cabeza = null;
        this.size = 10;
        this.cont = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }

    /**
     * <h1>Add</h1>
     * <p>
     * Agrega un string al final de la lista.</p>
     *
     * @param dato el string a guardar
     */
    public void add(String dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);

            if (cont == 9) {
                size = size + 10;
                cont = 0;
            }
        }
        cont++;

//        return true;
    }

    /**
     * <h1>ValoresMenores</h1>
     * <p>
     * Agrega un string al final de la lista.</p>
     *
     * @return String: Los 2 valores menores de la lista.
     */
    public String valoresMenores() {
        String menor1 = "";
        String menor2 = "";
        if (!isEmpty()) {
            Nodo aux = cabeza;
            while (aux.getSiguiente() != null) {
                int cont = 1;
                if(!menor1.equals("") && !menor2.equals("")){
                    if(aux.getDato().compareTo(menor1) <= 0){
                        menor1 = aux.getDato();
                        menor2 = aux.getSiguiente().getDato();
                    }
                }
                if (aux.getDato().compareTo(aux.getSiguiente().getDato()) <= 0 && cont == 1) {
                    menor1 = aux.getDato();
                    menor2 = aux.getSiguiente().getDato();
                }
                if (aux.getSiguiente().getDato().compareTo(aux.getDato()) <= 0) {
                    menor1 = aux.getSiguiente().getDato();
                    menor2 = aux.getDato();
                }
                
                aux = aux.getSiguiente();
            }
            return "Los valores menores son: " + menor1 + " y " + menor2;
        }
        return null;
    }

    /**
     * <h1>Invertir</h1>
     * <p>
     * Invierte el orden en el que se agregaron los datos de la lista.</p>
     */
    public void invertirLista() {
        if (cabeza != null) {
            Nodo aux = cabeza;
            Nodo aux2;

            while (aux.getSiguiente() != null) {
                aux2 = aux.getSiguiente();
                aux.setSiguiente(aux2.getSiguiente());
                aux2.setSiguiente(cabeza);
                cabeza = aux2;
            }
        }
    }

    public void mostrarLista() {
        if (!isEmpty()) { //Si la lista no esta vacía.
            Nodo aux = cabeza;
            while (aux != null) {
                System.out.print("[ " + aux.getDato() + " ]" + "-");
                aux = aux.getSiguiente();
            }
        }
    }
}
