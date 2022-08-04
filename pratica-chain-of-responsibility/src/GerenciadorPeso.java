public class GerenciadorPeso extends Gerenciador{
    @Override
    public void vereficar(Artigo artigo) {
        if(artigo.getPeso() > 1199 && artigo.getPeso() < 1301){
            if(getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().vereficar(artigo);
            }
        }
        else {
            System.out.println("Rejeitado");
        }
    }
}
