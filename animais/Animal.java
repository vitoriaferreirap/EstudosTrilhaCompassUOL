package animais;

//comportamento de o gato e cachorro podem fazer
// interface serve para definir o comportamento de uma classe
public interface Animal {
    // metodo que deve ser implementado por todas as classes que implementarem a
    // metodos abstratos
    void fazerBarulho();

    void comer();

    void dormir();

}
