package br.com.springAtividade.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculoDTO {
    private double media;
    private double mediana;
    private double desvioPadrao;
    private int qtdDados;
}
