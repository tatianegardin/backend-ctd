public class Main {
    public static void main(String[] args) {
        CheckArtigo checkArtigo = new CheckArtigo();
        checkArtigo.verificar(new Artigo("Artigo 1", 1000, 1200, "saudável"));
        checkArtigo.verificar(new Artigo("Artigo 2", 900, 1200, "quase saudável"));
        checkArtigo.verificar(new Artigo("Artigo 3", 1000, 100, "saudável"));
        checkArtigo.verificar(new Artigo("Artigo 3", 1000, 1200, "não saudável"));
    }
}