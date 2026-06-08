
package eleccioncarreras;

import java.util.Scanner;

public class arbolBinario {
    
    private Nodo raiz;
    
    public arbolBinario(){
        raiz = null;
    }
    
    public boolean arbolConstruido(){
        
        return raiz != null;
    }
    
    public void crearArbol(){
        
        raiz = new Nodo("Preferis lo mental o lo fisico? M/F", false);
        
        Nodo fisico = new Nodo("Te gusta hacer cosa al aire libre? N/S", false);
        Nodo mental = new Nodo("Te gusta resolver problemas? N/S", false);
        
        raiz.setIzquierda(fisico);
        raiz.setDerecha(mental);
                
        //Fisico

        Nodo ensenar = new Nodo("Te gusta enseñar? N/S", false);
        Nodo planear = new Nodo("Te gusta planear y modelar? N/S", false);
        
        fisico.setIzquierda(ensenar);
        fisico.setDerecha(planear);
        
        ensenar.setIzquierda(new Nodo("Profesorado de Educacion Fisica", true));
        
        Nodo aconsejar = new Nodo("Te gusta aconsejar? N/S", false);
        
        ensenar.setDerecha(aconsejar);
        
        aconsejar.setIzquierda(new Nodo("Fisioterapia", true));
        aconsejar.setDerecha(new Nodo("Turismo", true));
        
        planear.setIzquierda(new Nodo("Arquitectura", true));
        
        Nodo criterioFisico = new Nodo("Te gusta dar soluciones segun tu criterio personal? N/S",false);
        
        planear.setDerecha(criterioFisico);
        
        criterioFisico.setIzquierda(new Nodo("Comunicacion", true));
        criterioFisico.setDerecha(new Nodo("Administracion", true));
                        
        //Mental
        
        Nodo matematica = new Nodo("Te gustan los problemas matematicos y de logica? N/S" , false);
        Nodo criterioMental = new Nodo("Te gusta dar soluciones segun tu criterio personal? N/S", false);
        
        mental.setIzquierda(matematica);
        mental.setDerecha(criterioMental);
        
        matematica.setIzquierda(new Nodo("Ingeneria Informatica", true));
        
        matematica.setDerecha(criterioMental);
        
        criterioMental.setIzquierda(new Nodo("Psicologia", true));
        criterioMental.setDerecha(new Nodo("Profesorado Biologia", true));
                
        System.out.println("\nArbol construido correctamente");
    }
    
    public void recomendarCarrera(){
        
        if (raiz == null) {
            
            System.out.println("\nPrimero debe construir el arbol.");
            return;
        }
        
        Scanner teclado = new Scanner(System.in);
        
        Nodo actual = raiz;
        
        System.out.println("\n====== ORIENTACION VOCACIONAL =====");
        
        while(!actual.isEsCarrera()){
            
            System.out.println("\n" + actual.getDato());
            String respuesta = teclado.nextLine().toUpperCase();
            
            if (respuesta.equals("SI") || respuesta.equals("S") ||
                respuesta.equals("NO") || respuesta.equals("N") ) {
                
                if (respuesta.equals("SI") || respuesta.equals("S")) {
                    
                    actual = actual.getIzquierda();
                } else {
                    
                    actual = actual.getDerecha();
                }
            } else {
                
                System.out.println("Respuesta incorrecta. Ingese la opcion correcta.");
            }
        }
        
        System.out.println("\n============================");
        System.out.println("Carrera Sugerida: ");
        System.out.println(actual.getDato());
        System.out.println("=============================");
        
        
    }
}
