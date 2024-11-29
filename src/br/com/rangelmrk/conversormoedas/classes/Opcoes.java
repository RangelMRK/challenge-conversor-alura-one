package br.com.rangelmrk.conversormoedas.classes;

import java.util.HashMap;
import java.util.Map;

public class Opcoes {

    private final Map<Integer, Conversoes> opcoesConversao;

    public Opcoes() {
        opcoesConversao = new HashMap<>();
        opcoesConversao.put(1, Conversoes.ARS_TO_BRL);
        opcoesConversao.put(2, Conversoes.BRL_TO_ARS);
        opcoesConversao.put(3, Conversoes.BOB_TO_BRL);
        opcoesConversao.put(4, Conversoes.BRL_TO_BOB);
        opcoesConversao.put(5, Conversoes.CLP_TO_BRL);
        opcoesConversao.put(6, Conversoes.BRL_TO_CLP);
        opcoesConversao.put(7, Conversoes.COP_TO_BRL);
        opcoesConversao.put(8, Conversoes.BRL_TO_COP);
        opcoesConversao.put(9, Conversoes.USD_TO_BRL);
        opcoesConversao.put(10, Conversoes.BRL_TO_USD);
    }

    public Conversoes getOpcao(Integer chave){
        return opcoesConversao.get(chave);
    }

    public void listarOpcoes() {
        System.out.println("""
                               
                Operações de conversão disponíveis: 
                
                _____________________________________________________________
                
                1. Pesos (Argentina) para Reais (Brasil) (ARS para BRL)
                2. Reais (Brasil) para Pesos (Argentina) (BRL para ARS)
                3. Boliviano (Bolívia) para Reais (Brasil) (BOB para BRL)
                4. Reais (Brasil) para Boliviano (Bolívia) (BRL para BOB)
                5. Pesos (Chile) para Reais (Brasil) (CLP para BRL)
                6. Reais (Brasil) para Pesos (Chile) (BRL para CLP)
                7. Pesos (Colômbia) para Reais (Brasil) (COP para BRL)
                8. Reais (Brasil) para Pesos (Colômbia) (BRL para COP
                9. Dólar (Estados Unidos) para Reais (Brasil) (USD para BRL)
                10. Reais (Brasil) para Dólar (Estados Unidos) (BRL para USD)
                
                ______________________________________________________________
                """);
    }
}
