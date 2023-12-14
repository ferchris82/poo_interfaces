package org.chrisferdev.poointerfaces.imprenta;

import org.chrisferdev.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv =new Curriculum("John Doe", "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador fullstack");
        cv.addExperiencias("Angular");

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
