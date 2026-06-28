package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void mostrarServicios() {

        // Rutas gastronómicas
        RutaGastronomica ruta1 =
                new RutaGastronomica("Ruta Sabores del Sur", 4, 5);

        RutaGastronomica ruta2 =
                new RutaGastronomica("Ruta Tradiciones Chilotas", 3, 4);

        // Paseos lacustres
        PaseoLacustre paseo1 =
                new PaseoLacustre("Paseo Lago Llanquihue", 2, "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre("Navegación Volcánica", 3, "Lancha");

        // Excursiones culturales
        ExcursionCultural excursion1 =
                new ExcursionCultural("Historia de Frutillar", 2,
                        "Museo Colonial Alemán");

        ExcursionCultural excursion2 =
                new ExcursionCultural("Patrimonio Local", 4,
                        "Teatro del Lago");

        // Mostrar resultados
        System.out.println("========================================");
        System.out.println("      SERVICIOS TURÍSTICOS");
        System.out.println("========================================\n");

        System.out.println("=== RUTAS GASTRONÓMICAS ===");
        System.out.println(ruta1);
        System.out.println();
        System.out.println(ruta2);

        System.out.println("\n=== PASEOS LACUSTRES ===");
        System.out.println(paseo1);
        System.out.println();
        System.out.println(paseo2);

        System.out.println("\n=== EXCURSIONES CULTURALES ===");
        System.out.println(excursion1);
        System.out.println();
        System.out.println(excursion2);
    }
}