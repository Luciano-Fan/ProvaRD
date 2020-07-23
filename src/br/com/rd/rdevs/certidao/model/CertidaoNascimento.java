package br.com.rd.rdevs.certidao.model;

public class CertidaoNascimento extends Certidao {

    CertidaoNascimento tipoCertidao;

    public CertidaoNascimento() {
    }

    public CertidaoNascimento(int registroCertidão, String nomeDeclarante, String nomeObj, CertidaoNascimento tipoCertidao, String dataEmissao, String nomeTabeliao, String nomeCartorio) {
        super(registroCertidão, nomeDeclarante, nomeObj, tipoCertidao, dataEmissao, nomeTabeliao, nomeCartorio);
        this.tipoCertidao = new CertidaoNascimento();
    }

    public String toString() {
        return super.toString() + "Certidao de Nascimento";
    }
}
