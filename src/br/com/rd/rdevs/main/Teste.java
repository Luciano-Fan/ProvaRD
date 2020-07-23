package br.com.rd.rdevs.main;

import br.com.rd.rdevs.certidao.model.Certidao;
import br.com.rd.rdevs.certidao.model.CertidaoNascimento;
import br.com.rd.rdevs.contrato.model.Contrato;
import br.com.rd.rdevs.contrato.model.ContratoTrabalho;
import br.com.rd.rdevs.contrato.model.TestemunhaInsuficienteException;

import java.util.ArrayList;
import java.util.HashSet;

public class Teste {

    public static void main(String[] args) {

        HashSet<String> nomeEnvolvidos = new HashSet<>();
        ArrayList <String> nomeTestemunhas = new ArrayList<>();

        HashSet<String> nomeEnvolvidos2 = new HashSet<>();
        ArrayList <String> nomeTestemunhas2 = new ArrayList<>();
        nomeEnvolvidos2.add("Nome Criativo ");
        nomeTestemunhas2.add("Nome Mais Criativo ");


        for (int i = 0; i < 10; i++) {
            nomeEnvolvidos.add("Nome Criativo " + i);
            nomeTestemunhas.add("Nome Mais Criativo " + i);
        }

        CertidaoNascimento cn = new CertidaoNascimento();
        ContratoTrabalho ct = new ContratoTrabalho();

        try {
            Certidao c2 = new CertidaoNascimento(3,"Luciano", "Lucas",cn,"08/10/98","Nome Tabeliao","Nome cartorio");
            Contrato c = new ContratoTrabalho(1,nomeEnvolvidos,nomeTestemunhas, "10/02/19","10/02/19","nome tabeliao","nome cartorio",ct);
            //Contrato c1 = new ContratoTrabalho(2,nomeEnvolvidos2,nomeTestemunhas2, "10/02/19","10/02/19","nome tabeliao","nome cartorio",ct);

            Contrato.registrar(c);
            Certidao.registrar(c2);
        } catch (TestemunhaInsuficienteException t) {
            System.out.println(t.getMessage());
        }
    }


}
