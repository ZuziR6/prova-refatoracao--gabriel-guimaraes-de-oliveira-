package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Carlos", "ABC-1234", 10);

        System.out.println("Dono: " + veiculo.getProprietario());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Gasolina inicial: " + veiculo.getGasolina());

        veiculo.adicionarGasolina(50);

        System.out.println("Gasolina após abastecimento: " + veiculo.getGasolina());

        veiculo.gastarGasolina(100);

        System.out.println("Gasolina após tentativa de consumo: " + veiculo.getGasolina());

        veiculo.gastarGasolina(20);

        System.out.println("Gasolina após consumo válido: " + veiculo.getGasolina());
    }
}