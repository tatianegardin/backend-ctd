public class Usuario {
    private long id;
    private String tipoConta;

    public Usuario(long id, String tipoConta) {
        this.id = id;
        this.tipoConta = tipoConta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
