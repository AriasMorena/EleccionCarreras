package eleccioncarreras;

import java.util.Scanner;

public class arbolBinario {

    private Nodo raiz;

    public arbolBinario() {
        raiz = null;
    }

    public boolean arbolConstruido() {

        return raiz != null;
    }

    private Nodo crear(String texto, boolean esCarrera) {
        return new Nodo(texto, esCarrera);
    }

    public void crearArbol() {

        raiz = new Nodo("¿Te gusta más lo mental que lo físico? N/S", false);

        Nodo fisico = crear("¿Te gusta analizar resolver problemas o trabajar con datos? N/S", false);
        Nodo mental = crear("¿Te gusta trabajar con tu cuerpo en movimiento? N/S", false);

        raiz.setIzquierda(fisico);
        raiz.setDerecha(mental);

        //Fisico
        Nodo materiales = crear("¿Te gusta trabajar con materiales herramientas o maquinarias? N/S", false);
        Nodo deporte = crear("¿Te intrara el deporte, salud o bienestar físico? N/S", false);

        fisico.setIzquierda(deporte);
        fisico.setDerecha(materiales);

        // -- Materiales --
        Nodo aireLibre = crear("¿Te gusta trabajar al aire libre o con la naturaleza? N/S", false);
        Nodo estructuras = crear("¿Te interesa construir o diseñar estructuras? N/S", false);

        materiales.setIzquierda(estructuras);
        materiales.setDerecha(aireLibre);

        // ---- Aire Libre ----
        Nodo cocinar = crear("¿Te gusta cocinar? N/S", false);
        Nodo animales = crear("¿Te interesan los animales? N/S", false);

        aireLibre.setIzquierda(animales);
        aireLibre.setDerecha(cocinar);

        cocinar.setDerecha(crear("Arquitectura", true));
        cocinar.setIzquierda(crear("Gastronomía", true));

        animales.setDerecha(crear("Agronomía", true));
        animales.setIzquierda(crear("Veterinaria", true));

        // ---- Estructuras ----
        Nodo tecnologia = crear("¿Te gusta la tecnología aplicada? N/S", false);

        estructuras.setIzquierda(crear("Ingenería Civíl", true));
        estructuras.setDerecha(tecnologia);

        tecnologia.setIzquierda(crear("Ingeniería Eléctrica", true));
        tecnologia.setDerecha(crear("Producción Industrial", true));

        // -- Deporte --
        Nodo reparar = crear("¿Te gusta reparar y construir? N/S", false);
        Nodo salud = crear("¿Te gustaría ayudar a mejorar la salud física de otros? N/S", false);

        deporte.setIzquierda(salud);
        deporte.setDerecha(reparar);

        reparar.setIzquierda(crear("Ingeniería Mecánica", true));
        reparar.setDerecha(crear("Diseño Industrial", true));

        salud.setIzquierda(crear("Fisioterapia / Kinisiología", true));
        salud.setDerecha(crear("Entrenamiento Deportivo", true));

        //Mental
        Nodo matematica = crear("¿Te gustan las matemáticas o la lógica? N/S", false);
        Nodo personas = crear("¿Te gusta trabajar con personas? N/S", false);

        mental.setIzquierda(matematica);
        mental.setDerecha(personas);

        // -- Matematica --
        Nodo economia = crear("¿Te interesa la enconomía, finanzas o gestión de recursos? N/S", false);
        Nodo software = crear("¿Te gusta crear software, sistemas o tecnología? N/S", false);

        matematica.setIzquierda(software);
        matematica.setDerecha(economia);

        economia.setIzquierda(crear("Administración y Finanzas", true));
        economia.setDerecha(crear("Contaduría Pública", true));

        software.setIzquierda(crear("Ingeniería en Sistemas", true));
        software.setDerecha(crear("Ciencia de Datos", true));

        // -- Personas --
        Nodo investigar = crear("¿Te gusta investigar, leer o trabajar con ideas? N/S", false);
        Nodo ensenar = crear("¿Te gusta enseñar y ayudar a otros? N/S", false);

        personas.setDerecha(investigar);
        personas.setIzquierda(ensenar);

        // ---- Investigar ----
        Nodo arte = crear("¿Te interesa el arte y el diseño? N/S", false);
        Nodo ley = crear("¿Te interesa la ley o temas sociales? N/S", false);

        investigar.setDerecha(arte);
        investigar.setIzquierda(ley);

        arte.setIzquierda(crear("Diseño Grafico", true));
        arte.setDerecha(crear("Comunicación Audiovisual", true));

        ley.setDerecha(crear("Derecho", true));
        ley.setIzquierda(crear("Trabajo Social", true));

        // ---- Enseñar ----
        Nodo bienestar = crear("¿Te intera el bienestar emocional y mental? N/S", false);
        Nodo comunicar = crear("¿Te gusta comunicar ideas o hablar en público? N/S", false);

        ensenar.setIzquierda(comunicar);
        ensenar.setDerecha(bienestar);

        bienestar.setIzquierda(crear("Educación", true));
        bienestar.setDerecha(crear("Psicología", true));

        comunicar.setIzquierda(crear("Comunicación Social", true));
        comunicar.setDerecha(crear("Relaciones Internacionales", true));

        System.out.println("\nÁrbol construido correctamente");
    }

    public void recomendarCarrera() {

        if (raiz == null) {

            System.out.println("\nPrimero debe construir el arbol.");
            return;
        }

        Scanner teclado = new Scanner(System.in);

        Nodo actual = raiz;

        System.out.println("\n====== ORIENTACIÓN VOCACIONAL =====");

        while (!actual.isEsCarrera()) {

            System.out.println("\n" + actual.getDato());
            String respuesta = teclado.nextLine().toUpperCase();

            if (respuesta.equals("SI") || respuesta.equals("S")
                    || respuesta.equals("NO") || respuesta.equals("N")) {

                if (respuesta.equals("SI") || respuesta.equals("S")) {

                    actual = actual.getIzquierda();
                } else {

                    actual = actual.getDerecha();
                }
            } else {

                System.out.println("Respuesta invalida. Ingese una opcion valida.");
            }
        }

        System.out.println("\n============================");
        System.out.println("Carrera Sugerida: ");
        System.out.println(actual.getDato());
        System.out.println("=============================");

    }
}
