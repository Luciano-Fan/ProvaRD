package br.com.rd.rdevs.certidao.model;

public class CertidaoObito extends Certidao {

    CertidaoObito tipoCertidao;

    public CertidaoObito() {
    }

    public CertidaoObito(int registroCertidão, String nomeDeclarante, String nomeObj, CertidaoObito tipoCertidao, String dataEmissao, String nomeTabeliao, String nomeCartorio) {
        super(registroCertidão, nomeDeclarante, nomeObj, tipoCertidao, dataEmissao, nomeTabeliao, nomeCartorio);
        this.tipoCertidao = new CertidaoObito();
    }
    public String toString() {
        return super.toString() + "Certidao de Obito";
    }
}
