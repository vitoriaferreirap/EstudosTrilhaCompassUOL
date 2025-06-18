package animais;

public class Cachorro implements Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Au Au");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

}
