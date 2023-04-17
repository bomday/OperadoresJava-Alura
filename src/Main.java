// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //TIPOS PRIMITIVOS:
        // boolean (valores lógicos)
        // byte (valores numéricos inteiros de 8 bits)
        // char (caractere Unicode), short (valores numéricos inteiros de 16 bits)
        // int (inteiros)
        // long (valores numéricos inteiros de 64 bits)
        // float (valores decimais)
        //double (valores decimais e com maior capacidade de armazenamento comparado ao float)

        int valor =  5;  //Atribui o valor 5 à variável valor
        System.out.println(valor);
        valor =  10; //Recebe novo valor
        System.out.println(valor);
        valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 15 à variável valor
        System.out.println(valor);

        //OPERADORES ARITMÉTICOS
        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //OPERADORES RELACIONAIS
        int x = 10; // Atribui o valor 10 à variável x
        int y = 5; // Atribui o valor 5 à variável y
        int z = 30; // Atribui o valor 30 à variável z

        boolean igual = (y == x); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (y != z); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (y > x); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (y <= z); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

        System.out.println(igual);
        System.out.println(diferente);
        System.out.println(maior);
        System.out.println(menorIgual);

        //OPERADORES LÓGICOS
        boolean t = true;
        boolean f = false;
        if (t && f) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
            System.out.println("Não irei aparecer :O");
        }

        if (t || f) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
            System.out.println("Finalmente executado!");
        }

        if (!t) {
            // Este código não será executado, já que a é verdadeiro.
            System.out.println("Não aparecerei também :(");
        }

        //OPERADORES DE INCREMENTO
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int outroNum = 5;
        int outroResultado = outroNum++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(outroNum); // imprime 6
        System.out.println(outroResultado); // imprime 5
    }
}