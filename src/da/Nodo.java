package da;

/**
 *
 * @author Johan Herrera
 */
public class Nodo {

    private Nodo siguiente;
    private String dato;

    public Nodo(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
