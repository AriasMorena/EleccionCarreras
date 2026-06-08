
package eleccioncarreras;

public class Nodo {
    
    private Nodo derecha;
    private Nodo izquierda;
    private String dato;
    private boolean esCarrera;
    
    public Nodo(String dato, boolean esCarrera){
        
        this.dato = dato;
        this.esCarrera = esCarrera;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public String getDato() {
        return dato;
    }

    public boolean isEsCarrera() {
        return esCarrera;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
}