package dispositivo.implementacoes;

import dispositivo.interfaces.ReprodutorMusical;
import dispositivo.interfaces.AparelhoTelefonico;
import dispositivo.interfaces.NavegadorInternet;

public class Apps extends Ipod implements AparelhoTelefonico, NavegadorInternet {

    private Phone phone = new Phone();
    private Browser browser = new Browser();

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        phone.ligar(numero);
    }

    @Override
    public void atender() {
        phone.atender();
    }

    @Override
    public String adicionarContato(String contato) {
        return phone.adicionarContato(contato);
    }

    @Override
    public String removerContato(String contato) {
        return phone.removerContato(contato);
    }

    @Override
    public void iniciarCorreioVoz() {
        phone.iniciarCorreioVoz();
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        browser.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        browser.adicionarNovaAba();
    }

    @Override
    public void removerNovaAba() {
        browser.removerNovaAba();
    }

    @Override
    public void fecharPagina() {
        browser.fecharPagina();
    }

    @Override
    public void atualizarPagina() {
        browser.atualizarPagina();
    }
}
