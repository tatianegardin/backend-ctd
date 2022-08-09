public class Arvore {
    private String id;
    private double altura;
    private double largura;
    private String cor;
    private String tipo;

    private int contador;

    public Arvore( double altura, double largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.contador = 1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "id='" + id + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", contador=" + contador +
                '}';
    }
}
