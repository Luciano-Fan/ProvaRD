package br.com.rd.rdevs.contrato.model;


import java.util.ArrayList;
import java.util.HashSet;

public abstract class Contrato  {
    private static int identificador = 0;
    private int registroContrato;
    private HashSet <String> nomeEnvolvidos;
    private ArrayList <String> nomeTestemunhas;
    private String dataEmissao;
    private String dataRegistro;
    private String nomeTabeliao;
    private String nomeCartorio;
    private Contrato tipoContrato;

    public Contrato() {
        identificador++;
    }

    public Contrato(int registroContrato, HashSet <String> nomeEnvolvidos, ArrayList <String> nomeTestemunhas, String dataEmissao, String dataRegistro, String nomeTabeliao, String nomeCartorio, Contrato tipoContrato) throws TestemunhaInsuficienteException {
        this.registroContrato = registroContrato;
        this.nomeEnvolvidos = nomeEnvolvidos;
        this.dataEmissao = dataEmissao;
        this.dataRegistro = dataRegistro;
        this.nomeTabeliao = nomeTabeliao;
        this.nomeCartorio = nomeCartorio;
        identificador++;

        if (nomeTestemunhas.size() >= 2){
            this.nomeTestemunhas = nomeTestemunhas;
        } else {
           throw new TestemunhaInsuficienteException("No minimo duas testemunhas");
        }

        if(tipoContrato instanceof ContratoCompraVenda){
            ContratoCompraVenda contrato = new ContratoCompraVenda();
            this.tipoContrato = contrato;
        }else if (tipoContrato instanceof ContratoPrestacaoServico){
            ContratoPrestacaoServico contrato = new ContratoPrestacaoServico();
            this.tipoContrato = contrato;
        }else {
            ContratoTrabalho contrato = new ContratoTrabalho();
            this.tipoContrato = contrato;
        }
    }

    public int getRegistroContrato() {
        return registroContrato;
    }

    public void setRegistroContrato(int registroContrato) {
        this.registroContrato = registroContrato;
    }

    public HashSet<String> getNomeEnvolvidos() {
        return nomeEnvolvidos;
    }

    public ArrayList<String> getNomeTestemunhas() {
        return nomeTestemunhas;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getNomeTabeliao() {
        return nomeTabeliao;
    }

    public void setNomeTabeliao(String nomeTabeliao) {
        this.nomeTabeliao = nomeTabeliao;
    }

    public String getNomeCartorio() {
        return nomeCartorio;
    }

    public void setNomeCartorio(String nomeCartorio) {
        this.nomeCartorio = nomeCartorio;
    }

    public Contrato getTipoContrato() {
        return tipoContrato;
    }

    public static int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "registroContrato = " + registroContrato +
                ", nomeEnvolvidos =" + nomeEnvolvidos +
                ", nomeTestemunhas =" + nomeTestemunhas +
                ", dataEmissao ='" + dataEmissao + '\'' +
                ", dataRegistro ='" + dataRegistro + '\'' +
                ", nomeTabeliao ='" + nomeTabeliao + '\'' +
                ", nomeCartorio ='" + nomeCartorio + '\'' +
                ", tipoContrato = "
                ;
    }

    public static void registrar(Contrato c){
        System.out.println(c + " Carimbo de autenticidade");
    }
}

