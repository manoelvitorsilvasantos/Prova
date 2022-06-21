/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.main;

import java.util.Scanner;

/**
 *
 * @author mvictor
 */
public class Main {
    
    private static final Runnable questao1 =  () -> {
        int INDICE = 13, SOMA = 0, K = 0;
        do{
            K += 1;
            SOMA = SOMA + K;
        }while(K < INDICE);
        System.out.println("a variável SOMA?  >> "+String.valueOf(SOMA));
    };
    
    private static Runnable questao2 = ()->{
        int n = 0, ultimo = 1, penultimo = 1;
        
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        int termo = 0;
        if ( n == 1 || n == 2){
            System.out.println(1);
        }else{
            int contador = 3;
            while (contador <= n){
                termo = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = termo;
                contador += 1;
            }
            System.out.println(termo);
        }
    /*            count=3
    while count <= n:
        termo = ultimo + penultimo
        penultimo = ultimo
        ultimo = termo
        count += 1
    print(termo)*/
        
    };
    
    private static Runnable questao3 = ()->{
    };
    private static Runnable questao4 = ()->{
    };
    private static Runnable questao5 = ()->{
    };

    public static void main(String[] args)  
    {
        Scanner leitor = new Scanner(System.in);
        int opc = -1;
        while(opc != 0){
            System.out.println("Digite uma opção: ");
            opc = leitor.nextInt();
            System.out.printf("Escolheu a opção %d\n", opc);
            switch(opc)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    new Thread(questao1).start();
                    
                    break;
                case 2:
                    new Thread(questao2).start();
                    break;
                case 3:
                    new Thread(questao3).start();
                    break;
                case 4:
                    new Thread(questao4).start();
                    break;
                case 5:
                    new Thread(questao5).start();
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
    
}
