public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Miau", 3);

        System.out.println("Perro:");
        perro.hacerSonido();
        perro.comer();
        perro.beber();
        perro.dormir();
        perro.hacerTruco();
        perro.hacerTruco("saltar");

        System.out.println("\nGato:");
        gato.hacerSonido();
        gato.comer();
        gato.beber();
        gato.dormir();
    }
}
