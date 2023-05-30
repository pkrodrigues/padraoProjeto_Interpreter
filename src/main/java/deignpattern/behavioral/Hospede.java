package deignpattern.behavioral;

public class Hospede {
    private int quantidadesDias;
    private double valorDiaria;
    private int cupomDesconto;

    public int getQuantidadesDias() {
        return quantidadesDias;
    }

    public void setQuantidadesDias(int quantidadesDias) {
        this.quantidadesDias = quantidadesDias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(int cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

    public double calcularHospedagem()
    {
        return Hotel.calculaHospedagem(this.quantidadesDias, this.valorDiaria, this.cupomDesconto);
    }
}
