/*7.	 (Opcional)	Escreva	um	programa	em	que,	dada	uma	variável		x		com	algum	valor	inteiro,	temos	um
novo		x		de	acordo	com	a	seguinte	regra:
Se		x		é	par,		x	=	x	/	2	;
Se		x		é	impar,		x	=	3	*	x	+	1	;
Imprime		x	; */

package atividades;

import java.util.Scanner;

public class At7 {
    public static void main(String[]args){
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO: ");
        x = sc.nextInt();

        while(x > 1){
            if(x % 2== 0){
                x= x/2;
            System.out.printf(" %d ->", x );
            
            }else{

            x = 3 * x + 1;
            System.out.printf(" %d ->", x);
        }}
        sc.close();
    }

}
