import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class SegundoTesteJavaCalculandoAsQuatroOperacoes {

    @Test
    public void PrimerioTesteDeSoma(){
        Calculadora calculadora = new Calculadora();
        int num1 = 10, num2 = 10;
        int result = calculadora.somar(num1, num2);

        Assert.assertEquals(20, result);
        Assertions.assertThat(result).isEqualTo(20);
        Assertions.assertThat(result).isBetween(19, 21);
        Assertions.assertThat(result).isGreaterThan(19);
    }

    @Test
    public void segundoTesteSubtrai(){
        Calculadora calculadoraSub = new Calculadora();
        int num1Sub = 20, num2Sub = 5;
        int result2 = calculadoraSub.subtrair(num1Sub, num2Sub);

        Assert.assertEquals(15, result2);
        Assertions.assertThat(result2).isEqualTo(15);
        Assertions.assertThat(result2).isBetween(14, 21);
        Assertions.assertThat(result2).isGreaterThan(14);
    }

    @Test
    public void segundoTesteDividir(){
        Calculadora calculadoraDivisor = new Calculadora();
        int num1Div = 20, num2Div = 20;
        int resultDivi = calculadoraDivisor.dividir(num1Div, num2Div);

        Assert.assertEquals(1, resultDivi);
        Assertions.assertThat(resultDivi).isEqualTo(1);
        Assertions.assertThat(resultDivi).isBetween(0, 2);
        Assertions.assertThat(resultDivi).isGreaterThan(0);
    }

    @Test
    public void segundoTesteMultiplica(){
        Calculadora calculadoraMultiplica = new Calculadora();
        int num1Mult = 5, num2Mult = 5;
        int resultMultiplica = calculadoraMultiplica.multiplica(num1Mult, num2Mult);

        Assert.assertEquals(25, resultMultiplica);
        Assertions.assertThat(resultMultiplica).isEqualTo(25);
        Assertions.assertThat(resultMultiplica).isBetween(24, 26);
        Assertions.assertThat(resultMultiplica).isGreaterThan(20);
    }
}

class Calculadora{
    int somar(int num1, int num2){
        return num1 + num2;
    }

    int subtrair(int num1, int num2){
        return num1 - num2;
    }

    int dividir(int num1, int num2){
        return  num1 / num2;
    }

    int multiplica(int num1, int num2){
        return num1 * num2;
    }
}