public class ServicoDownloadProxy implements Download{

    @Override
    public void downloadMusica(Usuario usuario) {
        if(usuario.getTipoConta().equalsIgnoreCase("premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.downloadMusica(usuario);
        } else {
            System.out.println("Sua conta é free, não pode baixar a música");
        }
    }
}
