package br.com.rd.rdevs.contrato.model;

import java.util.ArrayList;
import java.util.HashSet;

public class ContratoCompraVenda extends Contrato {

    private ContratoCompraVenda tipoContrato;

    public ContratoCompraVenda() {
    }

    public ContratoCompraVenda(int registroContrato, HashSet<String> nomeEnvolvidos, ArrayList<String> nomeTestemunhas, String dataEmissao, String dataRegistro, String nomeTabeliao, String nomeCartorio, ContratoCompraVenda tipoContrato) throws TestemunhaInsuficienteException {
        super(registroContrato, nomeEnvolvidos, nomeTestemunhas, dataEmissao, dataRegistro, nomeTabeliao, nomeCartorio, tipoContrato);
        this.tipoContrato = tipoContrato;
    }

    public String toString() {
        return super.toString() + "Contrato Compra e Venda";
    }

}
