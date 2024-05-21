package dispositivo.interfaces;

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    String adicionarContato(String contato);
    String removerContato(String contato);
    void iniciarCorreioVoz();
}
