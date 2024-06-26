public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

  // Métodos da interface ReprodutorMusical
  @Override
  public void tocar() {
      System.out.println("Reproduzindo música...");
  }

  @Override
  public void pausar() {
      System.out.println("Música pausada.");
  }

  @Override
  public void selecionarMusica(String musica) {
      System.out.println("Selecionando música: " + musica);
  }

  // Métodos da interface AparelhoTelefonico
  @Override
  public void ligar(String numero) {
      System.out.println("Ligando para: " + numero);
  }

  @Override
  public void atender() {
      System.out.println("Atendendo chamada...");
  }

  @Override
  public void iniciarCorreioVoz() {
      System.out.println("Iniciando correio de voz...");
  }

  // Métodos da interface NavegadorInternet
  @Override
  public void exibirPagina(String url) {
      System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
      System.out.println("Adicionando nova aba no navegador.");
  }

  @Override
  public void atualizarPagina() {
      System.out.println("Atualizando página.");
  }

  public static void main(String[] args) {
      iPhone meuIPhone = new iPhone();
      
      // Testando ReprodutorMusical
      meuIPhone.selecionarMusica("Minha Música Favorita");
      meuIPhone.tocar();
      meuIPhone.pausar();
      
      // Testando AparelhoTelefonico
      meuIPhone.ligar("123-456-7890");
      meuIPhone.atender();
      meuIPhone.iniciarCorreioVoz();
      
      // Testando NavegadorInternet
      meuIPhone.exibirPagina("https://www.exemplo.com");
      meuIPhone.adicionarNovaAba();
      meuIPhone.atualizarPagina();
  }
}

