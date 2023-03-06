package projetoSeguro.aplication;

import projetoSeguro.model.Caminhao;
import projetoSeguro.model.Motorista;
import projetoSeguro.model.Seguro;
import projetoSeguro.repository.Motoristas;

public class ConsultaCobertura {

    public static void main(String[] args) {

        Motoristas motoristas = new Motoristas();

        String cobertura = motoristas.porNome("Joao")
                .flatMap(Motorista::getCaminhao)
                .flatMap(Caminhao::getSeguro)
                .map(Seguro::getCobertura)
                .orElse("Sem cobertura");

        System.out.println("A cobertura é: " + cobertura);
    }

}

