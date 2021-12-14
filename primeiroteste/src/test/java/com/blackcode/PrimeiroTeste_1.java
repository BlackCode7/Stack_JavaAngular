package com.blackcode;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.Assert;

public class PrimeiroTeste_1 {

    @Test
    public void EstruturaDeUmTeste() {
        Calculadora calculadora = new Calculadora();
        int numero1 = 10, numero2 = 5;
        int resultado = calculadora.somar(numero1, numero2);

        // cenário
        //int numero1 = 10, numero2 = 5;
        //execução
        //int resultado = numero1 + numero2;
        //verificações
        Assert.assertEquals(15, resultado);
        Assertions.assertThat(resultado).isBetween(14,16);
        Assertions.assertThat(resultado).isEqualTo(15);
        Assertions.assertThat(resultado).isGreaterThan(10);
        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test(expected = RuntimeException.class)
    public void naoTestaNumeroNegativoTeste(){
        //Cenário
        Calculadora calculadora = new Calculadora();
        int numero1 = -10, numero2 = 4;
        //Execução
        calculadora.somar(numero1, numero2);

        //Verificação
//        Assert.assertEquals(15, resultado);
//        Assertions.assertThat(resultado).isBetween(14,16);
//        Assertions.assertThat(resultado).isEqualTo(15);
//        Assertions.assertThat(resultado).isGreaterThan(10);
//        Assertions.assertThat(resultado).isEqualTo(15);
    }
}

class Calculadora{
    int somar(int num, int num2){
        if (num < 0 || num2 < 0) {
            throw new RuntimeException("Não é permitido somar números negativos!");
        }
        return num + num2;
    }
}