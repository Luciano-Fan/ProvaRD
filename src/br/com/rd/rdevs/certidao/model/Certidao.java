package br.com.rd.rdevs.certidao.model;

import br.com.rd.rdevs.Registro;
import br.com.rd.rdevs.contrato.model.Contrato;

public abstract class Certidao implements Registro {

    private static int identificador = 0;
    private int registroCertidao;
    private String nomeDeclarante;
    private String nomeObj;
    private String dataEmissao;
    private String nomeTabeliao;
    private String nomeCartorio;
    private Certidao tipoCertidao;

    public Certidao() {
        identificador++;
    }

    public Certidao(int registroCertidão, String nomeDeclarante, String nomeObj, Certidao tipoCertidao, String dataEmissao, String nomeTabeliao, String nomeCartorio) {
        this.registroCertidao = registroCertidão;
        this.nomeDeclarante = nomeDeclarante;
        this.nomeObj = nomeObj;
        this.dataEmissao = dataEmissao;
        this.nomeTabeliao = nomeTabeliao;
        this.nomeCartorio = nomeCartorio;
        identificador++;

        if(tipoCertidao instanceof CertidaoCasamento){
            CertidaoCasamento certidao = new CertidaoCasamento();
            this.tipoCertidao = certidao;
        }else if (tipoCertidao instanceof CertidaoNascimento){
            CertidaoNascimento certidao = new CertidaoNascimento();
            this.tipoCertidao = certidao;
        }else if (tipoCertidao instanceof CertidaoObito){
            CertidaoObito certidao = new CertidaoObito();
            this.tipoCertidao = certidao;
        }else {
            CertidaoPropriedades certidao = new CertidaoPropriedades();
            this.tipoCertidao = certidao;
        }
    }

    public int getRegistroCertidão() {
        return registroCertidao;
    }

    public void setRegistroCertidão(int registroCertidão) {
        this.registroCertidao = registroCertidão;
    }

    public String getNomeDeclarante() {
        return nomeDeclarante;
    }

    public void setNomeDeclarante(String nomeDeclarante) {
        this.nomeDeclarante = nomeDeclarante;
    }

    public String getNomeObj() {
        return nomeObj;
    }

    public void setNomeObj(String nomeObj) {
        this.nomeObj = nomeObj;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
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

    public int getRegistroCertidao() {
        return registroCertidao;
    }

    public void setRegistroCertidao(int registroCertidao) {
        this.registroCertidao = registroCertidao;
    }

    public Certidao getTipoCertidao() {
        return tipoCertidao;
    }

    public static int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "registroCertidao = " + registroCertidao +
                ", nomeDeclarante = '" + nomeDeclarante + '\'' +
                ", nomeObj = '" + nomeObj + '\'' +
                ", dataEmissao = '" + dataEmissao + '\'' +
                ", nomeTabeliao = '" + nomeTabeliao + '\'' +
                ", nomeCartorio = '" + nomeCartorio + '\'' +
                ", tipoCertidao = " ;
    }

    @Override
    public void registrar(Object o) {
        System.out.println(o + " Carimbo de autenticidade");
    }
}
