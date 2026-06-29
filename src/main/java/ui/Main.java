package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("    SISTEMA DE GESTIÓN LLANQUIHUE TOUR  ");
        System.out.println("========================================\n");

        GestorServicios gestor = new GestorServicios();
        ServicioTuristico[] servicios = gestor.crearServiciosPrueba();

        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio.toString());
        }
    }
}