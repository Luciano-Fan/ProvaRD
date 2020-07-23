package br.com.rd.rdevs.certidao.model;

public class CertidaoPropriedades extends Certidao {

    CertidaoPropriedades tipoCertidao;

    public CertidaoPropriedades() {
    }

    public CertidaoPropriedades(int registroCertidão, String nomeDeclarante, String nomeObj, CertidaoPropriedades tipoCertidao, String dataEmissao, String nomeTabeliao, String nomeCartorio) {
        super(registroCertidão, nomeDeclarante, nomeObj, tipoCertidao, dataEmissao, nomeTabeliao, nomeCartorio);
        this.tipoCertidao = new CertidaoPropriedades();
    }

    public String toString() {
        return super.toString() + "Certidao de Propriedades";
    }
}
