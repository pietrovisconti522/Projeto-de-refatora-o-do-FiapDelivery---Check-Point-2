package br.com.fiapdelivery;

public class Principal {

    public static void main(String[] args) {

    	Moto moto = new Moto(
    		    "XYZ5678",
    		    50.0,
    		    true
    		);

        Pacote pacote = new Pacote(
            "BR999",
            10.5,
            "Pendente"
        );

        Rota rota = new Rota(pacote, moto);

        rota.realizarEntrega();
    }
}