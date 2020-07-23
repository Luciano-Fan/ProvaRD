package br.com.rd.rdevs.contrato.model;

import java.util.ArrayList;
import java.util.HashSet;

public class ContratoPrestacaoServico extends Contrato {

    private ContratoPrestacaoServico tipoContrato;

    public ContratoPrestacaoServico() {
    }


    public ContratoPrestacaoServico(int registroContrato, HashSet<String> nomeEnvolvidos, ArrayList<String> nomeTestemunhas, String dataEmissao, String dataRegistro, String nomeTabeliao, String nomeCartorio, ContratoPrestacaoServico tipoContrato) throws TestemunhaInsuficienteException {
        super(registroContrato, nomeEnvolvidos, nomeTestemunhas, dataEmissao, dataRegistro, nomeTabeliao, nomeCartorio, tipoContrato);
        this.tipoContrato = tipoContrato;
    }


    public String toString() {
        return super.toString() + "Contrato Prestacao de Servico";
    }


}
