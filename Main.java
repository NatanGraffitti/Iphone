

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das implementações
        ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
        NavegadorInternet navegadorNaInternet = new NavegadorInternetImpl();

        reprodutorMusical.selecionarMusica("Bohemian Rhapsody - Queen");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorNaInternet.exibirPagina("https://www.Google.com");
        navegadorNaInternet.adicionarNovaAba();
        navegadorNaInternet.atualizarPagina();
    }
}