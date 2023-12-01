/* 6.	 (Opcional)	 Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	 A	 série	 de
Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc.	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
segundo	vale	1,	e	daí	por	diante.	O	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)-
ésimo	elemento	(ex:	8	=	5	+	3).*/

package atividades;

public class At6 {
    public static void main(String[] args) {
        int numAnterior = 0, numAtual = 0, numProximo = 0;
        for (int i = 1; i <= 13; i++) {
            if (i == 2) {
                numAtual = 1;
                numAtual = 1;
                System.out.printf(" %d", numAtual);
            } else {

                numProximo = numAtual + numAnterior;
                numAnterior = numAtual;
                numAtual = numProximo;
                System.out.printf(" %d", numProximo);

            }

        }
    }
}
