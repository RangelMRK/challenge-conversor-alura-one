package br.com.rangelmrk.conversormoedas.classes;

public enum Conversoes {
    ARS_TO_BOB("ARS", "BOB"),
    ARS_TO_BRL("ARS", "BRL"),
    ARS_TO_CLP("ARS", "CLP"),
    ARS_TO_COP("ARS", "COP"),
    ARS_TO_USD("ARS", "USD"),
    BOB_TO_ARS("BOB", "ARS"),
    BOB_TO_BRL("BOB", "BRL"),
    BOB_TO_CLP("BOB", "CLP"),
    BOB_TO_COP("BOB", "COP"),
    BOB_TO_USD("BOB", "USD"),
    BRL_TO_ARS("BRL", "ARS"),
    BRL_TO_BOB("BRL", "BOB"),
    BRL_TO_CLP("BRL", "CLP"),
    BRL_TO_COP("BRL", "COP"),
    BRL_TO_USD("BRL", "USD"),
    CLP_TO_ARS("CLP", "ARS"),
    CLP_TO_BOB("CLP", "BOB"),
    CLP_TO_BRL("CLP", "BRL"),
    CLP_TO_COP("CLP", "COP"),
    CLP_TO_USD("CLP", "USD"),
    COP_TO_ARS("COP", "ARS"),
    COP_TO_BOB("COP", "BOB"),
    COP_TO_BRL("COP", "BRL"),
    COP_TO_CLP("COP", "CLP"),
    COP_TO_USD("COP", "USD"),
    USD_TO_ARS("USD", "ARS"),
    USD_TO_BOB("USD", "BOB"),
    USD_TO_BRL("USD", "BRL"),
    USD_TO_CLP("USD", "CLP"),
    USD_TO_COP("USD", "COP");


    private final String moedaOrigem;
    private final String moedaDestino;

    Conversoes(String moedaOrigem, String moedaDestino) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }
}
