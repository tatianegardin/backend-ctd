public class GerenciadorEmbalagem extends Gerenciador {
    @Override
    public void vereficar(Artigo artigo) {
        if(artigo.getEmabalagem().equalsIgnoreCase("saudável") || artigo.getEmabalagem().equalsIgnoreCase("quase saudável") ){
            System.out.println("Aceito");
        }else{
            System.out.println("Rejeitado");
        }
    }
}
