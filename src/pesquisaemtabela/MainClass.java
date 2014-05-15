/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisaemtabela;

import java.util.Random;

/**
 *
 * @author groda
 */
public class MainClass {

    public static void main(String[] args) {
        TabelaHash t1 = new TabelaHash(997);
        t1.insereTabelaHash(5664, "Xico");
        t1.insereTabelaHash(6554, "Zé");
        t1.insereTabelaHash(9987, "Keko");
        t1.insereTabelaHash(2345, "Kiko");

        Random r = new Random();

        Integer i = 0;
        Integer chave;
        while (i < 500) {
            chave = Math.abs(r.nextInt(100));
            t1.insereTabelaHash(chave, chave.toString());
            System.out.println("Chave = " + chave);
            i++;
        }

        i = 0;
        while (i < 500) {
            chave = Math.abs(r.nextInt(1000));
            if (t1.pesquisaTabela(chave)) {
                System.out.println("Achou a chave = " + chave);
            } else {
                System.out.println("Não achou a chave = " + chave);
            }
            i++;
        }

        if (t1.pesquisaTabela(5555)) {

        }
    }
}
