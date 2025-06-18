package equalsHashCode.aplicacao;

import equalsHashCode.entidades.Cliente;

public class Programa {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", "abc");
        Cliente c2 = new Cliente("Alex", "def");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // false objestos não são iguais se não true

    }
}
