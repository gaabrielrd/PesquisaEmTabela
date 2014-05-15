/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisaemtabela;

/**
 *
 * @author groda
 */
public class TabelaHash {

    private Entrada[] tab;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        tab = new Entrada[this.tamanho]; 
    }

    public int calculaEndereco(Integer rg) {
        return (rg % tamanho);
    }

    public Boolean insereTabelaHash(Integer rg, String nome) {
        Integer endereco = calculaEndereco(rg);
        if (!pesquisaTabela(rg)) {
            //Versão alternativa
            while (tab[endereco] != null && !tab[endereco].getStatus().equals('3')) {
                endereco = (endereco + 1) % tamanho;
            }
            if (tab[endereco] == null) {
                tab[endereco] = new Entrada(rg, nome, "Guabiruba", 66);
                tab[endereco].setStatus('2');
            } else {
                tab[endereco].setRg(rg);
                tab[endereco].setNome(nome);
                tab[endereco].setStatus('2');
            }
            return true;
            //            if (tab[endereco].getStatus().equals('1')
            //                    || tab[endereco].getStatus().equals('3')) {
            //                tab[endereco].setRg(rg);
            //                tab[endereco].setNome(nome);
            //                tab[endereco].setStatus('2');
            //            } else {
            //                //calcula o proximo endereço
            //                endereco = (endereco + 1) % tamanho;
            //            }           

        } else {
            return false;
        }
    }

    public boolean pesquisaTabela(Integer rg) {
        Integer endereco = calculaEndereco(rg);
        Boolean sai = false;
        do {
            if (tab[endereco] == null) {
                return false;
            } else {
                if (tab[endereco].getStatus().equals('2')) {
                    if (tab[endereco].getRg() == rg) {
                        return true;
                    } else {
                        endereco = (endereco + 1) % tamanho;
                    }
                }
            }
        } while (!sai);
        return false;
    }
}
