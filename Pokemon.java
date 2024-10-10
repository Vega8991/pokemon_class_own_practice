public class Pokemon {
    // Atributos
    private String nombre;
    private int potencia;
    private int vida;
    private int defensa;

    // Constructor
    public Pokemon(String nombreP, int potenciaP, int vidaP, int defensaP) {
        nombre = nombreP;
        potencia = potenciaP;
        vida = vidaP;
        defensa = defensaP;
    }

    // Métodos para mostrar los detalles del Pokémon
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Potencia: " + potencia);
        System.out.println("Vida: " + vida);
        System.out.println("Defensa: " + defensa);
        System.out.println("-------------------------");
    }

    // Método principal
    public static void main(String[] args) {
        // Crear instancias de los Pokémon
        Pokemon rayquaza = new Pokemon("Rayquaza", 150, 105, 90);
        Pokemon bulbasaur = new Pokemon("Bulbasaur",49,45,49);
        Pokemon marshadow = new Pokemon("Marshadow",125,90,80);
        Pokemon lapras = new Pokemon("Lapras",85,130,80);
        // Mostrar información de cada Pokémon
        rayquaza.mostrarInfo();
        bulbasaur.mostrarInfo();
        marshadow.mostrarInfo();
        lapras.mostrarInfo();

    }
}
