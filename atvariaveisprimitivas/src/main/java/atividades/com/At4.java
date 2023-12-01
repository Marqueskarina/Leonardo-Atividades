package atividades.com;

public class At4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
             int fatorial = i;
            if (i == 1) {
                fatorial = 0;
            } else {
                for (int j = i-1; j >= 1; j--) {
                    fatorial *= j;
                }
            }
            System.out.printf("O fatorial de %d é: !%d = %d\n", i, i, fatorial);
        }
    }

}
