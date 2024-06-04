public class Usuario {
    public static void main(String[] args) throws Exception {
       SmarTV smarTV = new SmarTV();

       smarTV.diminuirVolume();
       smarTV.diminuirVolume();
       smarTV.diminuirVolume();
       smarTV.aumentarVolume();
       System.out.println("Volume Atual " + smarTV.volume);

       System.out.println("TV Ligada? " + smarTV.ligada);

       System.out.println("Canal Atual " + smarTV.canal);
       smarTV.aumentarCanal();
       smarTV.diminuirCanal();
       smarTV.mudarCanal(13);
       System.out.println("Volume Atual " + smarTV.volume);

       smarTV.ligar(); 
       System.out.println("Novo Status -> TV Ligada? " + smarTV.ligada);
       smarTV.desligar();
       System.out.println("Novo Status -> TV Ligada? " + smarTV.ligada);
    }
}
