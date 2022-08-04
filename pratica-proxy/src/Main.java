public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "free");
        Usuario usuario1 = new Usuario(1, "premium");
        Download download = new ServicoDownloadProxy();
        download.downloadMusica(usuario);
        download.downloadMusica(usuario1);
    }
}