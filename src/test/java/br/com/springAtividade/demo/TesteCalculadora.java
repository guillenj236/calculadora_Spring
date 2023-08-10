package br.com.springAtividade.demo;
import br.com.springAtividade.demo.service.CalculoService;
import br.com.springAtividade.demo.dto.EntradaDTO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class TesteCalculadora {
    CalculoService calculoService = new CalculoService();
    @Test
    public void testMedia() {

        EntradaDTO entrada = new EntradaDTO();
        entrada.setNumeros(Arrays.asList(5, 5, 5));

        double media = calculoService.media(entrada);
        Assert.assertEquals(5.0, media, 0.001);
    }
    @Test
    public void testMediana() {
        EntradaDTO entrada = new EntradaDTO();
        entrada.setNumeros(Arrays.asList(2, 4, 6, 8));

        double mediana = calculoService.mediana(entrada);
        Assert.assertEquals(5.0, mediana, 0.001);
    }
    @Test
    public void testDesvioPadrao() {
        EntradaDTO entrada = new EntradaDTO();
        entrada.setNumeros(Arrays.asList(2, 4, 6, 8));

        double desvioPadrao = calculoService.desvioPadrao(entrada);
        Assert.assertEquals(2.236, desvioPadrao, 0.001);
    }
    @Test
    public void testValorMaximo() {
        EntradaDTO entrada = new EntradaDTO();
        entrada.setNumeros(Arrays.asList(2, 4, 6, 8));

        int valorMaximo = calculoService.valorMaximo(entrada);
        Assert.assertEquals(8, valorMaximo);
    }

    @Test
    public void testValorMinimo() {
        EntradaDTO entrada = new EntradaDTO();
        entrada.setNumeros(Arrays.asList(2, 4, 6, 8));

        int valorMinimo = calculoService.valorMinimo(entrada);
        Assert.assertEquals(2, valorMinimo);
    }
    @Test
    public void testSoma() {
        EntradaDTO entrada = new EntradaDTO();
        entrada.setNumeros(Arrays.asList(2, 4, 6, 8));

        int soma = calculoService.soma(entrada);
        Assert.assertEquals(20, soma);
    }
}
