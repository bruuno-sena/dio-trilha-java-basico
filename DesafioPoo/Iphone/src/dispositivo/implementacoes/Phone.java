package dispositivo.implementacoes;

import dispositivo.interfaces.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public String adicionarContato(String contato) {
        return "Adicionando contato: " + contato;
    }

    @Override
    public String removerContato(String contato) {
        return "Removendo contato: " + contato;
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
