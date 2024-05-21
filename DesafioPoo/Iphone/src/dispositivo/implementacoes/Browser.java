package dispositivo.implementacoes;

import dispositivo.interfaces.NavegadorInternet;

public class Browser implements NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void removerNovaAba() {
        System.out.println("Removendo aba");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
