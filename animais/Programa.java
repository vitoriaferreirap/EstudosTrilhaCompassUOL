package animais;

public class Programa {
    public static void main(String[] args) {
        // instanciando objetos das classes Gato e Cachorro
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        // chamando os métodos das classes Gato e Cachorro
        gato.fazerBarulho();
        cachorro.fazerBarulho();

        gato.comer();
        gato.dormir();

        cachorro.comer();
        cachorro.dormir();
    }
}
