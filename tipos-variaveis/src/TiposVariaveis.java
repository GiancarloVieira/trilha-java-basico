public class TiposVariaveis {
    public void exemplosTiposPrimitivos() {
        // Tipos numéricos inteiros
        byte exemploByte = 127;         // 8 bits
        short exemploShort = 32767;     // 16 bits
        int exemploInt = 2147483647;    // 32 bits
        long exemploLong = 9223372036854775807L; // 64 bits
        
        // Tipos numéricos de ponto flutuante
        float exemploFloat = 3.14f;     // 32 bits
        double exemploDouble = 3.141592653589793; // 64 bits

        // Tipo caractere
        char exemploChar = 'A';         // 16 bits (Unicode)

        // Tipo booleano
        boolean exemploBoolean = true;  // 1 bit (valor true ou false)

        // Exibindo os valores das variáveis
        System.out.println("Exemplo byte: " + exemploByte);
        System.out.println("Exemplo short: " + exemploShort);
        System.out.println("Exemplo int: " + exemploInt);
        System.out.println("Exemplo long: " + exemploLong);
        System.out.println("Exemplo float: " + exemploFloat);
        System.out.println("Exemplo double: " + exemploDouble);
        System.out.println("Exemplo char: " + exemploChar);
        System.out.println("Exemplo boolean: " + exemploBoolean);
    }

    public static void main(String[] args) {
        TiposVariaveis tp = new TiposVariaveis();
        tp.exemplosTiposPrimitivos();
    }
}
