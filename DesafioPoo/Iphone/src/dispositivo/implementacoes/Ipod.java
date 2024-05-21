package dispositivo.implementacoes;

import dispositivo.interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void proxima() {
        System.out.println("Próxima música");
    }

    @Override
    public void anterior() {
        System.out.println("Música anterior");
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Selecionando música: " + musica;
    }
}
