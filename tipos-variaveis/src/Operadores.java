public class Operadores {
  public void exemplosOperadores() {
    // Operadores aritméticos
    int a = 10;
    int b = 5;
    System.out.println("Operadores aritméticos:");
    System.out.println("a + b = " + (a + b)); // Adição
    System.out.println("a - b = " + (a - b)); // Subtração
    System.out.println("a * b = " + (a * b)); // Multiplicação
    System.out.println("a / b = " + (a / b)); // Divisão
    System.out.println("a % b = " + (a % b)); // Módulo

    // Operadores unários
    System.out.println("\nOperadores unários:");
    System.out.println("+a = " + (+a)); // Operador unário positivo
    System.out.println("-a = " + (-a)); // Operador unário negativo
    System.out.println("++a = " + (++a)); // Incremento prefixado
    System.out.println("a++ = " + (a++)); // Incremento postfixado
    System.out.println("--a = " + (--a)); // Decremento prefixado
    System.out.println("a-- = " + (a--)); // Decremento postfixado

    // Operadores de igualdade e relacionais
    System.out.println("\nOperadores de igualdade e relacionais:");
    System.out.println("a == b = " + (a == b)); // Igualdade
    System.out.println("a != b = " + (a != b)); // Desigualdade
    System.out.println("a > b = " + (a > b)); // Maior que
    System.out.println("a < b = " + (a < b)); // Menor que
    System.out.println("a >= b = " + (a >= b)); // Maior ou igual a
    System.out.println("a <= b = " + (a <= b)); // Menor ou igual a

    // Operadores lógicos
    boolean x = true;
    boolean y = false;
    System.out.println("\nOperadores lógicos:");
    System.out.println("x && y = " + (x && y)); // E lógico
    System.out.println("x || y = " + (x || y)); // OU lógico
    System.out.println("!x = " + (!x)); // Negação lógica

    // Operadores bitwise
    int c = 6; // 110 em binário
    int d = 4; // 100 em binário
    System.out.println("\nOperadores bitwise:");
    System.out.println("c & d = " + (c & d)); // E bitwise
    System.out.println("c | d = " + (c | d)); // OU bitwise
    System.out.println("c ^ d = " + (c ^ d)); // OU exclusivo bitwise
    System.out.println("~c = " + (~c)); // Complemento bitwise
    System.out.println("c << 1 = " + (c << 1)); // Deslocamento à esquerda
    System.out.println("c >> 1 = " + (c >> 1)); // Deslocamento à direita
    System.out.println("c >>> 1 = " + (c >>> 1)); // Deslocamento à direita com zero preenchimento

    // Operadores de atribuição
    System.out.println("\nOperadores de atribuição:");
    int e = 10;
    e += 5; // e = e + 5
    System.out.println("e += 5 -> " + e);
    e -= 5; // e = e - 5
    System.out.println("e -= 5 -> " + e);
    e *= 2; // e = e * 2
    System.out.println("e *= 2 -> " + e);
    e /= 2; // e = e / 2
    System.out.println("e /= 2 -> " + e);
    e %= 3; // e = e % 3
    System.out.println("e %= 3 -> " + e);
    e &= 1; // e = e & 1
    System.out.println("e &= 1 -> " + e);
    e |= 2; // e = e | 2
    System.out.println("e |= 2 -> " + e);
    e ^= 3; // e = e ^ 3
    System.out.println("e ^= 3 -> " + e);
    e <<= 1; // e = e << 1
    System.out.println("e <<= 1 -> " + e);
    e >>= 1; // e = e >> 1
    System.out.println("e >>= 1 -> " + e);
    e >>>= 1; // e = e >>> 1
    System.out.println("e >>>= 1 -> " + e);
  }

  public static void main(String[] args) {
    Operadores op = new Operadores();
    op.exemplosOperadores();
  }
}
