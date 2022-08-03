
//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(){
        if(calcularPontos() < 20 ){
            return "Estagiário " + this.nome + " tem um total de " + calcularPontos() + " e categoriza como novato";
        } else if (calcularPontos() < 31){
            return"Estagiário " + this.nome + " tem um total de " + calcularPontos() + " e categoriza como aprendiz";
        } else if (calcularPontos() < 41){
            return "Estagiário " + this.nome + " tem um total de " + calcularPontos() + " e categoriza como bom";
        } else {
            return "Estagiário " + this.nome + " tem um total de " + calcularPontos() + " e categoriza como mestre";
        }
    }
}





