package DesafioTargetRP;

/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */
public class Desafio5 {
    public static void main(String[] args) {
        String palavra = "Exemplo";
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}


