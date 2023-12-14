package org.chrisferdev.poointerfaces.imprenta;

import org.chrisferdev.poointerfaces.imprenta.modelo.*;
import static org.chrisferdev.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv =new Curriculum("John Doe", "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador fullstack");
        cv.addExperiencias("Angular");

        Libro libro = new Libro("Erich Gamme", "Patrones de diseños: Elem. Reusables POO"
                , PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
