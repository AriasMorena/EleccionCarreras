
package eleccioncarreras;

public class Nodo {
    
    private Nodo derecha;
    private Nodo izquierda;
    private String dato;
    private boolean esCarrera;
    
    public Nodo(String dato, boolean esCarrera){
        
        this.dato = dato;
        this.esCarrera = esCarrera;
        this.derecha = null;
        this.izquierda = null;
    }
}