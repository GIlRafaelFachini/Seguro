package projetoSeguro.repository;

import projetoSeguro.model.Caminhao;
import projetoSeguro.model.Motorista;
import projetoSeguro.model.Seguro;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Motoristas {

    private Map<String, Optional<Motorista>>motoristas = new HashMap<>();

    public Motoristas(){

        Seguro seguro = new Seguro("Parcial - não cobre roubo.", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Scania" , Optional.ofNullable(seguro));
        Optional<Motorista> motoristajoao = Optional.of(new Motorista("Joao",40,Optional.ofNullable(caminhao)));
        Optional<Motorista> motoristajose = Optional.of(new Motorista("Jose",35,Optional.ofNullable(null)));

        motoristas.put("Joao" , motoristajoao);
        motoristas.put("Jose" , motoristajose);
    }

    public Optional<Motorista>porNome(String nome){
        return motoristas.get(nome);
    }

}
