package br.com.rd.rdevs.contrato.model;

import java.util.ArrayList;
import java.util.HashSet;

public class ContratoTrabalho extends Contrato {

    private ContratoTrabalho tipoContrato;

    public ContratoTrabalho() {
    }

    public ContratoTrabalho(int registroContrato, HashSet<String> nomeEnvolvidos, ArrayList<String> nomeTestemunhas, String dataEmissao, String dataRegistro, String nomeTabeliao, String nomeCartorio, ContratoTrabalho tipoContrato) throws TestemunhaInsuficienteException {
        super(registroContrato, nomeEnvolvidos, nomeTestemunhas, dataEmissao, dataRegistro, nomeTabeliao, nomeCartorio, tipoContrato);
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return super.toString() + "Contrato Trabalho";
    }
}
