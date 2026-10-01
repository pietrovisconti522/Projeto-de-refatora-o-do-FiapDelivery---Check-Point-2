package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(
            "ABC1234",
            500.0,
            6
        );

        Pacote pacote = new Pacote(
            "BR999",
            10.5,
            "Pendente"
        );

        Rota rota = new Rota(pacote, caminhao);

        rota.realizarEntrega();
    }
}