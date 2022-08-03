public class Estagiario extends Vendedor{
    public Estagiario(String nome) {
        super.nome = nome;

    }

    @Override
    public int calcularPontos() {
        return super.vendas * 5;
    }

    @Override
    public String mostrarCategoria() {

       if(calcularPontos() < 50){
           return "Estagiário " + super.nome + " tem um total de " + calcularPontos() + " e categoriza como novato";
       }
       return "Estagiário " + super.nome + " tem um total de " + calcularPontos() + " e categoriza como experiente";
    }
}
