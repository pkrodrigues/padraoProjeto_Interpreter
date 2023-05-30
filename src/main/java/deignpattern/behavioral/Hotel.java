package deignpattern.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public static String formula = "quantidadeDias * valorDiaria - desconto";

    public static double calculaHospedagem(int quantidadeDias, double valorDiaria, int desconto)
    {
        String expressao;
        expressao = formula.replace("quantidadeDias", Integer.toString(quantidadeDias));
        expressao = expressao.replace("valorDiaria", Double.toString(valorDiaria));
        expressao = expressao.replace("desconto", Integer.toString(desconto));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesElementos(expressao);
        return interpretador.interpretar();


    }
}
