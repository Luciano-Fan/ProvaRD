package br.com.rd.rdevs.certidao.model;

public class CertidaoCasamento extends Certidao {

    CertidaoCasamento tipoCertidao;

    public CertidaoCasamento() {
    }

    public CertidaoCasamento(int registroCertidão, String nomeDeclarante, String nomeObj, CertidaoCasamento tipoCertidao, String dataEmissao, String nomeTabeliao, String nomeCartorio) {
        super(registroCertidão, nomeDeclarante, nomeObj, tipoCertidao, dataEmissao, nomeTabeliao, nomeCartorio);
        this.tipoCertidao = new CertidaoCasamento();
    }

    public String toString() {
        return super.toString() + "Certidao de Casamento";
    }
}
