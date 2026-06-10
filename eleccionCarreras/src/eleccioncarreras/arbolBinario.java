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

        Nodo mental = crear("¿Te gusta analizar resolver problemas o trabajar con datos? N/S", false);
        Nodo fisico = crear("¿Te gusta trabajar con tu cuerpo en movimiento? N/S", false);

        raiz.setIzquierda(fisico);
        raiz.setDerecha(mental);

        //Fisico
        Nodo materiales = crear("¿Te gusta trabajar con materiales herramientas o maquinarias? N/S", false);
        Nodo deporte = crear("¿Te interesa el deporte, salud o bienestar físico? N/S", false);

        fisico.setIzquierda(materiales);
        fisico.setDerecha(deporte);

        // -- Materiales --
        Nodo aireLibre = crear("¿Te gusta trabajar al aire libre o con la naturaleza? N/S", false);
        Nodo estructuras = crear("¿Te interesa construir o diseñar estructuras? N/S", false);

        materiales.setIzquierda(aireLibre);
        materiales.setDerecha(estructuras);

        // ---- Aire Libre ----
        Nodo cocinar = crear("¿Te gusta cocinar? N/S", false);
        Nodo animales = crear("¿Te interesan los animales? N/S", false);

        aireLibre.setIzquierda(cocinar);
        aireLibre.setDerecha(animales);

        cocinar.setIzquierda(crear("Arquitectura\n\n¿En qué consiste?\nDiseño de edificios y espacios funcionales. Combina la creatividad, planificación y conocimientos técnicos.", true));
        cocinar.setDerecha(crear("Gastronomía\n\n¿En qué consiste?\nCreación y elaboración de alimentos. También puede gestionar cocinas y emprendimientos gastronómicos.", true));

        animales.setDerecha(crear("Veterinaria\n\n¿En qué consiste?\nPreviene, diagnosstica y trata enfermedades en animales. Promueve su salud y bienestar.", true));
        animales.setIzquierda(crear("Agronomía\n\n¿En qué consiste?\nMejora la producción agrícola y ganadera. Aplica conocimiento sobre cultivos, suelos y medio ambiente.", true));

        // ---- Estructuras ----
        Nodo tecnologia = crear("¿Te gusta la tecnología aplicada? N/S", false);

        estructuras.setIzquierda(tecnologia);
        estructuras.setDerecha(crear("Ingenería Civíl\n\n¿En qué consiste?\nPlanifica y construye obras como puentes, rutas y edificios. Garantiza seguridad y funcionalidad en las estructuras.", true));

        tecnologia.setIzquierda(crear("Producción Industrial\n\n¿En qué consiste?\nOrganiza y optimiza procesos de fabricación. Busca mejorar la calidad y eficiencia de la producción.", true));
        tecnologia.setDerecha(crear("Ingeniería Eléctrica\n\n¿En qué consiste?\nDiseña y mantiene sistemas eléctricos y energéticos. Trabaja con generación, distribución y uso de la electricidad.", true));

        // -- Deporte --
        Nodo reparar = crear("¿Te gusta reparar y construir? N/S", false);
        Nodo salud = crear("¿Te gustaría ayudar a mejorar la salud física de otros? N/S", false);

        deporte.setIzquierda(reparar);
        deporte.setDerecha(salud);

        reparar.setDerecha(crear("Ingeniería Mecánica\n\n¿En qué consiste?\nDiseña y mejora máquinas y sistemas mecánicos. Aplica principios de física y matemática para resolver problemas técnicos.", true));
        reparar.setIzquierda(crear("Diseño Industrial\n\n¿En qué consiste?\nDiseña productos útiles y atractivos. Combina creatividad, ergonometríay procesos de fabricación.", true));

        salud.setDerecha(crear("Fisioterapia / Kinisiología\n\n¿En qué consiste?\nAyuda a prevenir y rehabilitar lesiones. Busca mejorar la movilidad y calidad de vida de las personas.", true));
        salud.setIzquierda(crear("Entrenamiento Deportivo\n\n¿En qué consiste?\nPlanifica actividades fisicas para mejorar el rendimiento y la salud. Trabaja con deportistas o público general.", true));

        //Mental
        Nodo matematica = crear("¿Te gustan las matemáticas o la lógica? N/S", false);
        Nodo personas = crear("¿Te gusta trabajar con personas? N/S", false);

        mental.setIzquierda(personas);
        mental.setDerecha(matematica);

        // -- Matematica --
        Nodo economia = crear("¿Te interesa la enconomía, finanzas o gestión de recursos? N/S", false);
        Nodo software = crear("¿Te gusta crear software, sistemas o tecnología? N/S", false);

        matematica.setIzquierda(economia);
        matematica.setDerecha(software);

        economia.setIzquierda(crear("Contaduría Pública\n\n¿En qué consiste?\nAdministra información contable y financiera. Controla recursos económicos y el cumplimiento de normas.", true));
        economia.setDerecha(crear("Administración y Finanzas\n\n¿En qué consiste?\nPlanifica y gestiona recursos de empresas u organizaciones. Participa en la toma de decisiones económicas.", true));

        software.setIzquierda(crear("Ciencia de Datos\n\n¿En qué consiste?\nUtiliza estadísticas y tecnología para analizar información. Busca patrones que permitan resolver problemas.", true));
        software.setDerecha(crear("Ingeniería en Sistemas\n\n¿En qué consiste?\nDesarolla soluciones tecnológicas mediante software y sistemas informáticos. Combina lógica, programación y análisis de problemas.", true));

        // -- Personas --
        Nodo investigar = crear("¿Te gusta investigar, leer o trabajar con ideas? N/S", false);
        Nodo ensenar = crear("¿Te gusta enseñar y ayudar a otros? N/S", false);

        personas.setDerecha(ensenar);
        personas.setIzquierda(investigar);

        // ---- Investigar ----
        Nodo arte = crear("¿Te interesa el arte y el diseño? N/S", false);
        Nodo ley = crear("¿Te interesa la ley o temas sociales? N/S", false);

        investigar.setDerecha(ley);
        investigar.setIzquierda(arte);

        arte.setIzquierda(crear("Comunicación Audiovisual\n\n¿En qué consiste?\nInforma y comunica ideas através de diversos medios y plataformas.", true));
        arte.setDerecha(crear("Diseño Grafico\n\n¿En qué consiste?\nComunica ideas mediante ímagenes y recursos visuales. Diseña piezas para medios digitales e impresos.", true));

        ley.setDerecha(crear("Trabajo Social\n\n¿En qué consiste?\nInterviene en problemáticas sociales y comunitarias. Buscar mejorar el bienestar de las personas y grupos.", true));
        ley.setIzquierda(crear("Derecho\n\n¿En qué consiste?\nEstudia e interpreta la leyes. Defiende derechos y asesora en cuestiones jurídicas.", true));

        // ---- Enseñar ----
        Nodo bienestar = crear("¿Te intera el bienestar emocional y mental? N/S", false);
        Nodo comunicar = crear("¿Te gusta comunicar ideas o hablar en público? N/S", false);

        ensenar.setIzquierda(bienestar);
        ensenar.setDerecha(comunicar);

        bienestar.setIzquierda(crear("Psicología\n\n¿En qué consiste?\nEstudia el comportamiento humano y los procesos mentales. Ayuda a comprender y mejorar la salud emocional.", true));
        bienestar.setDerecha(crear("Educación\n\n¿En qué consiste?\nForma y guía el aprendizaje de otras personas. Diseña estrategias para enseñar conocimientos y habilidades.", true));

        comunicar.setIzquierda(crear("Relaciones Internacionales\n\n¿En qué consiste?\nAnaliza las relaciones entre países y organizaciones. Estudia política, economía y cooperación internacional.", true));
        comunicar.setDerecha(crear("Comunicación Social\n\n¿En qué consiste?\nInvestiga, produce y difunde información. Trabaja en medios, organizaciones y proyectos comunicacionales.", true));

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

                    actual = actual.getDerecha();
                } else {
                    
                    actual = actual.getIzquierda();

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
