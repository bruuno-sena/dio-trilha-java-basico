package dispositivo.interfaces;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void proxima();
    void anterior();
    String selecionarMusica(String musica);
}
