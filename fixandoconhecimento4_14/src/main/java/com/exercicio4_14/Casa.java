package com.exercicio4_14;

/*	Classe:	Casa
Atributos:	cor,	porta1,	porta2,	porta3
Método:	void	pinta(String	s),	
int	quantasPortasEstaoAbertas()
 */

public class Casa {
    private String cor;
    private Porta porta1 = new Porta();
    private Porta porta2 = new Porta();
    private Porta porta3 = new Porta();
    private int portasAbertas;

    public void pintarCasa(String cor) {
        this.cor = cor;
        System.out.println("A casa foi Pintada  de " + cor);
    }

    public void abrirPortas(int numPorta) {
        switch (numPorta) {
            case 1:
                this.porta1.abrirPorta();

                break;
            case 2:
                this.porta2.abrirPorta();

                break;
            case 3:
                this.porta3.abrirPorta();

                break;
            default:
                System.out.println("PORTA NÃO EXISTE");
        }

    }

    public void fecharPortas(int numPorta) {
        switch (numPorta) {
            case 1:
                this.porta1.fecharPorta();
                break;
            case 2:
                this.porta2.fecharPorta();
                break;
            case 3:
                this.porta3.fecharPorta();
                break;
            default:
                System.out.println("PORTA NÃO EXISTE");
        }
    }

    public void quantasPortasEstaoAbertas() {
        if (this.porta1.porta == true) {
            this.portasAbertas += 1;
        }
        if (this.porta2.porta == true) {
            this.portasAbertas += 1;
        }
        if (this.porta3.porta = true) {
            this.portasAbertas += 1;
        }
        System.out.println("Há " + portasAbertas + " Portas Abertas");

    }
}