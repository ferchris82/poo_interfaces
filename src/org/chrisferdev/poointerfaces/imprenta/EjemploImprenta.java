package org.chrisferdev.poointerfaces.imprenta;

import org.chrisferdev.poointerfaces.imprenta.modelo.*;
import static org.chrisferdev.poointerfaces.imprenta.modelo.Genero.*;
import static org.chrisferdev.poointerfaces.imprenta.modelo.Imprimible.*;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("John", "Doe"),
                "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencias("Java")
                .addExperiencias("Oracle DBA")
                .addExperiencias("Spring Framework")
                .addExperiencias("Desarrollador fullstack")
                .addExperiencias("Angular");

        Libro libro = new Libro(new Persona("Erich","Gamma"),
                "Patrones de diseños: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"), "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima!";
            }
        });

        System.out.println(TEXTO_DEFECTO);
    }


}
