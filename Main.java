public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();
        
        // Testando Aparelho Telefônico
        meuIphone.ligar("999888777");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
