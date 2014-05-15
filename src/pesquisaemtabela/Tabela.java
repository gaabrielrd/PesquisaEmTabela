package pesquisaemtabela;

/**
 *
 * @author groda
 */
public class Tabela {

    private Entrada[] tab;
    private Integer tamanho;

    public Tabela(Integer tamanho) {
        this.tamanho = tamanho;
        this.tab = new Entrada[tamanho];
    }

    public int pesquisaSequencial(Integer rg) {
        //???
        return -1;
    }

    public int pesquisaBinaria(Integer rg) {
        Integer LI, LS, m = -1;
        Boolean achou = false;
        LI = 0;
        LS = tamanho - 1;
        while (LS <= LI && !achou) {
            m = (LS - LI) / 2;
            if (tab[m].getRg() == rg) {
                achou = true;
            } else {
                if (tab[m].getRg() < rg) {
                    LI = m + 1;
                } else {
                    LS = m - 1;
                }
            }
        }
        if (achou) {
            return m;
        } else {
            return -1;
        }
    }

    public void bolha() {
        boolean trocou = false;
        int fim = tamanho;
        int posicao = 0;
        do {
            trocou = false;
            for (int i = 0; i < fim - 1; i++) {
                if (tab[i].getRg() > tab[i + 1].getRg()) {
                    Entrada temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    trocou = true;
                    posicao = i;
                }
            }
            fim = posicao;
        } while (trocou);
    }
}
