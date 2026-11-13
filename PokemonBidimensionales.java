package Proyecto;

import java.util.Scanner;

public class PokemonBidimensionales {

    static Scanner sc = new Scanner(System.in);

    // Nombre - Precio - Stock
    static String[][] cartas = {
            {"Charizard EX", "150", "3"},
            {"Pikachu VMAX", "70", "5"},
            {"Mew EX", "50", "4"},
            {"Umbreon EX", "300", "2"},
            {"Rayquaza GX", "120", "3"},
            {"Gengar EX", "90", "6"},
            {"Lugia VSTAR", "110", "4"}
    };

    static String[][] cajas = {
            {"ETB Escarlata y Purpura", "60", "5"},
            {"ETB Corona Astral", "65", "4"},
            {"Caja Charizard Premium", "150", "2"},
            {"Caja Terapagos EX", "45", "6"},
            {"Caja Pikachu EX", "40", "5"},
            {"Caja Eevee Especial", "80", "3"},
            {"Caja Mew Coleccion", "70", "4"}
    };

    static String[][] videojuegos = {
            {"Pokemon Rojo Fuego", "50", "3"},
            {"Pokemon Esmeralda", "80", "2"},
            {"Pokemon Diamante", "40", "5"},
            {"Pokemon Escarlata", "55", "6"},
            {"Pokemon Purpura", "55", "6"},
            {"Pokemon Arceus", "50", "4"},
            {"Pokemon Negro", "70", "3"}
    };

    static String[][] peluches = {
            {"Pikachu", "20", "10"},
            {"Eevee", "25", "8"},
            {"Charmander", "22", "7"},
            {"Bulbasaur", "22", "7"},
            {"Squirtle", "22", "7"},
            {"Snorlax", "35", "4"},
            {"Gengar", "30", "5"}
    };

    static String[][] coleccion = new String[100][1];
    static int totalCartas = 0;

    public static void mostrarMenu() {

        System.out.println("===== POKEMON TCG STORE =====");
        System.out.println("1. Ver cartas");
        System.out.println("2. Comprar carta");
        System.out.println("3. Comprar caja Pokémon");
        System.out.println("4. Comprar videojuego");
        System.out.println("5. Comprar peluche");
        System.out.println("6. Vender carta");
        System.out.println("7. Ver colección");
        System.out.println("8. Gradear carta");
        System.out.println("9. Completar colección");
        System.out.println("10. Salir");
        System.out.print("Opción: ");
    }

    public static void verCartas() {

        System.out.println("===== STOCK CARTAS =====");

        for (int i = 0; i < cartas.length; i++) {

            System.out.println(
                    (i + 1) + ". " +
                    cartas[i][0] +
                    " | Precio: " +
                    cartas[i][1] +
                    "€ | Stock: " +
                    cartas[i][2]);
        }
    }

    public static void comprarCarta() {

        verCartas();

        System.out.print("Seleccione una carta: ");
        int opcion = sc.nextInt();

        if (opcion >= 1 && opcion <= cartas.length) {

            int stock =
                    Integer.parseInt(cartas[opcion - 1][2]);

            if (stock > 0) {

                stock--;

                cartas[opcion - 1][2] =
                        String.valueOf(stock);

                coleccion[totalCartas][0] =
                        cartas[opcion - 1][0];

                totalCartas++;

                System.out.println(
                        "Has comprado " +
                        cartas[opcion - 1][0]);
            }
            else {
                System.out.println("No queda stock.");
            }
        }
    }

    public static void comprarCaja() {

        System.out.println("===== CAJAS POKEMON =====");

        for (int i = 0; i < cajas.length; i++) {

            System.out.println(
                    (i + 1) + ". " +
                    cajas[i][0] +
                    " | Precio: " +
                    cajas[i][1] +
                    "€ | Stock: " +
                    cajas[i][2]);
        }

        System.out.print("Seleccione una caja: ");
        int opcion = sc.nextInt();

        if (opcion >= 1 && opcion <= cajas.length) {

            int stock =
                    Integer.parseInt(cajas[opcion - 1][2]);

            if (stock > 0) {

                stock--;

                cajas[opcion - 1][2] =
                        String.valueOf(stock);

                System.out.println(
                        "Has comprado: " +
                        cajas[opcion - 1][0]);
            }
            else {
                System.out.println("Sin stock.");
            }
        }
    }

    public static void comprarVideojuego() {

        System.out.println("===== VIDEOJUEGOS =====");

        for (int i = 0; i < videojuegos.length; i++) {

            System.out.println(
                    (i + 1) + ". " +
                    videojuegos[i][0] +
                    " | Precio: " +
                    videojuegos[i][1] +
                    "€ | Stock: " +
                    videojuegos[i][2]);
        }

        System.out.print("Seleccione un videojuego: ");
        int opcion = sc.nextInt();

        if (opcion >= 1 && opcion <= videojuegos.length) {

            int stock =
                    Integer.parseInt(videojuegos[opcion - 1][2]);

            if (stock > 0) {

                stock--;

                videojuegos[opcion - 1][2] =
                        String.valueOf(stock);

                System.out.println(
                        "Has comprado: " +
                        videojuegos[opcion - 1][0]);
            }
            else {

                System.out.println("Sin stock.");
            }
        }
    }

    public static void comprarPeluche() {

        System.out.println("===== PELUCHES =====");

        for (int i = 0; i < peluches.length; i++) {

            System.out.println(
                    (i + 1) + ". " +
                    peluches[i][0] +
                    " | Precio: " +
                    peluches[i][1] +
                    "€ | Stock: " +
                    peluches[i][2]);
        }

        System.out.print("Seleccione un peluche: ");
        int opcion = sc.nextInt();

        if (opcion >= 1 && opcion <= peluches.length) {

            int stock =
                    Integer.parseInt(peluches[opcion - 1][2]);

            if (stock > 0) {

                stock--;

                peluches[opcion - 1][2] =
                        String.valueOf(stock);

                System.out.println(
                        "Has comprado: " +
                        peluches[opcion - 1][0]);
            }
            else {

                System.out.println("Sin stock.");
            }
        }
    }

    public static void venderCarta() {

        sc.nextLine();

        System.out.print("Nombre de la carta: ");
        String carta = sc.nextLine();

        System.out.println(
                "La tienda comprará la carta " +
                carta);

        System.out.println("Operación registrada.");
    }

    public static void verColeccion() {

        System.out.println("===== MI COLECCIÓN =====");

        if (totalCartas == 0) {

            System.out.println(
                    "No tienes cartas.");

            return;
        }

        for (int i = 0; i < totalCartas; i++) {

            System.out.println(
                    (i + 1) + ". " +
                    coleccion[i][0]);
        }
    }

    public static void gradearCarta() {

        if (totalCartas == 0) {

            System.out.println(
                    "No tienes cartas.");

            return;
        }

        verColeccion();

        System.out.print(
                "Selecciona una carta: ");

        int opcion = sc.nextInt();

        if (opcion >= 1 &&
                opcion <= totalCartas) {

            int nota =
                    (int)(Math.random() * 4) + 7;

            System.out.println(
                    "Carta: " +
                    coleccion[opcion - 1][0]);

            System.out.println(
                    "Grado PSA: " +
                    nota);
        }
    }

    public static void completarColeccion() {

        sc.nextLine();

        System.out.print(
                "Carta que buscas: ");

        String buscada =
                sc.nextLine();

        boolean encontrada =
                false;

        for (int i = 0; i < cartas.length; i++) {

            if (cartas[i][0]
                    .equalsIgnoreCase(buscada)) {

                encontrada = true;

                System.out.println(
                        "Disponible");

                System.out.println(
                        "Precio: " +
                        cartas[i][1] + "€");

                System.out.println(
                        "Stock: " +
                        cartas[i][2]);
            }
        }

        if (!encontrada) {

            System.out.println(
                    "No disponemos de esa carta.");
        }
    }

    public static void main(String[] args) {

        int opcion;

        do {

            mostrarMenu();

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    verCartas();
                    break;

                case 2:
                    comprarCarta();
                    break;

                case 3:
                    comprarCaja();
                    break;

                case 4:
                    comprarVideojuego();
                    break;

                case 5:
                    comprarPeluche();
                    break;

                case 6:
                    venderCarta();
                    break;

                case 7:
                    verColeccion();
                    break;

                case 8:
                    gradearCarta();
                    break;

                case 9:
                    completarColeccion();
                    break;

                case 10:
                    System.out.println(
                            "Programa finalizado.");
                    break;

                default:
                    System.out.println(
                            "Opción incorrecta.");
            }

        } while (opcion != 10);
    }
}