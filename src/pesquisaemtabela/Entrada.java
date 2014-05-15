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
public class Entrada {

    private Integer rg;     //PK
    private String nome;
    private String cidade;
    private Integer idade;
    private Character status = '1';    // 1 = livre, 2 = ocupado, 3 = excluído

    public Entrada(Integer rg, String nome, String cidade, Integer idade) {
        this.rg = rg;
        this.cidade = cidade;
        this.idade = idade;
        this.nome = nome;
    }

    /**
     * @return the rg
     */
    public Integer getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(Integer rg) {
        this.rg = rg;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
     * @return the status
     */
    public Character getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Character status) {
        this.status = status;
    }
}
