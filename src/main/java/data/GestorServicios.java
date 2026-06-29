package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    public ServicioTuristico[] crearServiciosPrueba() {
        // Corrección aquí: Nombre exacto de la clase base
        ServicioTuristico[] lista = new ServicioTuristico[6];

        lista[0] = new RutaGastronomica("Ruta del Kuchen Tradicional", 3, 4);
        lista[1] = new RutaGastronomica("Sabores del Mar en Angelmó", 4, 3);

        lista[2] = new PaseoLacustre("Navegación Lago Todos los Santos", 5, "Catamarán");
        lista[3] = new PaseoLacustre("Aventura en Kayak Frutillar", 2, "Kayak");

        lista[4] = new ExcursionCultural("Circuito Iglesias de Chiloé", 8, "Iglesia de Nercón");
        lista[5] = new ExcursionCultural("Colonización Alemana", 3, "Museo Colonial Alemán");

        return lista;
    }
}