package com.predicthealth.app.model;

public class PredictHealthModel {

    private String temperatura;
    private String nausea;
    private String dorLombar;
    private String urinandoMuito;
    private String dorAoUrinar;
    private String queimacaoNaUretra;

    public PredictHealthModel(String temperatura, String nausea, String dorLombar, String urinandoMuito, String dorAoUrinar, String queimacaoNaUretra) {
        this.temperatura = temperatura;
        this.nausea = nausea;
        this.dorLombar = dorLombar;
        this.urinandoMuito = urinandoMuito;
        this.dorAoUrinar = dorAoUrinar;
        this.queimacaoNaUretra = queimacaoNaUretra;
    }

    public PredictHealthModel() {
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getNausea() {
        return nausea;
    }

    public void setNausea(String nausea) {
        this.nausea = nausea;
    }

    public String getDorLombar() {
        return dorLombar;
    }

    public void setDorLombar(String dorLombar) {
        this.dorLombar = dorLombar;
    }

    public String getUrinandoMuito() {
        return urinandoMuito;
    }

    public void setUrinandoMuito(String urinandoMuito) {
        this.urinandoMuito = urinandoMuito;
    }

    public String getDorAoUrinar() {
        return dorAoUrinar;
    }

    public void setDorAoUrinar(String dorAoUrinar) {
        this.dorAoUrinar = dorAoUrinar;
    }

    public String getQueimacaoNaUretra() {
        return queimacaoNaUretra;
    }

    public void setQueimacaoNaUretra(String queimacaoNaUretra) {
        this.queimacaoNaUretra = queimacaoNaUretra;
    }
}
