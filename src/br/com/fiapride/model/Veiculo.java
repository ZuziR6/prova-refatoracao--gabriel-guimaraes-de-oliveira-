package br.com.fiapride.model;

public class Veiculo {

    private String proprietario;
    private String placa;
    private double gasolina;

    public Veiculo(String proprietario, String placa, double gasolina) {
        this.proprietario = proprietario;
        this.placa = placa;

        if (gasolina < 0) {
            this.gasolina = 0;
        } else {
            this.gasolina = gasolina;
        }
    }

    public void adicionarGasolina(double quantidade) {
        if (quantidade > 0) {
            gasolina += quantidade;
        }
    }

    public void gastarGasolina(double quantidade) {
        if (quantidade > 0 && quantidade <= gasolina) {
            gasolina -= quantidade;
        }
    }

    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public double getGasolina() {
        return gasolina;
    }
}