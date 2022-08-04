public class CheckArtigo {
    Gerenciador inicial;

    public CheckArtigo() {
        this.inicial = new GerenciarLote();
        Gerenciador peso = new GerenciadorPeso();
        Gerenciador embalagem = new GerenciadorEmbalagem();

        inicial.setGerenciadorSeguinte(peso);
        peso.setGerenciadorSeguinte(embalagem);
    }

    public void verificar(Artigo artigo){
        inicial.vereficar(artigo);
    }
}
