package main;

import dispositivo.implementacoes.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.proxima();
        meuIphone.anterior();
        System.out.println(meuIphone.selecionarMusica("Samba de Malandro - Canção de MC Daniel, MC Paulin da Capital e MC Ryan SP"));
        
        // Testando AparelhoTelefonico
        meuIphone.ligar("54999999999");
        meuIphone.atender();
        System.out.println(meuIphone.adicionarContato("Digital Innovation One"));
        System.out.println(meuIphone.removerContato("Digital Innovation One"));
        meuIphone.iniciarCorreioVoz();
        
        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.dio.me/");
        meuIphone.adicionarNovaAba();
        meuIphone.removerNovaAba();
        meuIphone.fecharPagina();
        meuIphone.atualizarPagina();
    }
}
