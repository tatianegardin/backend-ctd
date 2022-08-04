public class GerenciarLote extends Gerenciador{
    @Override
    public void vereficar(Artigo artigo) {
        if(artigo.getLote() > 999 && artigo.getLote() < 2001){
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().vereficar(artigo);
            }
        } else {
            System.out.println("Rejeitado");
        }
    }
}
