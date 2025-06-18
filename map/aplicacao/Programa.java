package map.aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("usuario", "jose");
        cookies.put("email", "amanda");
        cookies.put("telefone", "9999-9999");

        cookies.remove("telefone");

        cookies.put("usuario", "maria");// sobrescreve o valor da chave usuario, por que não aceita repetição

        // ver se tem a chave especifica
        System.out.println("EXISTE A CHAVE 'usuario'? " + cookies.containsKey("usuario"));
        // ver valor que não existe
        System.out.println("VALOR DA CHAVE 'nascimento': " + cookies.get("nascimento"));

        System.err.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {// pegar o valor da chave usuario
            System.err.println(key + " = " + cookies.get(key));
        }

        cookies.size();
        System.err.println("TOTAL DE COOKIES: " + cookies.size());
    }
}
