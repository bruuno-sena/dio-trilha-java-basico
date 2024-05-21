package dispositivo.interfaces;

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void removerNovaAba();
    void fecharPagina();
    void atualizarPagina();
}
