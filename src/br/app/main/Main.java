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
    
    
    public Main(){
        Scanner leitura = new Scanner(System.in);
        int opc = 0;
        while(true)
        {
            System.out.println("Digite uma opção >> ");
            opc = leitura.nextInt();
        
            switch(opc)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    questao1();
                    break;
                case 2:
                    questao2();
                    break;
                case 3:
                    questao3();
                    break;
                case 4:
                    questao4();
                    break;
                case 5:
                    questao5();
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
                    break;
            }
        }
    }
    
    public void questao1(){
        int INDICE = 13, SOMA = 0, K = 0;
        do{
            K += 1;
            SOMA = SOMA + K;
        }while(K < INDICE);
        System.out.println("a variável SOMA?  >> "+String.valueOf(SOMA));
    }
    
    public void questao2(){
       
    }
    
    public void questao3(){
        System.out.println("Ainda não está pronta!!!");
    }
    
    public void questao4(){
        System.out.println("Ainda não está pronta!!!");
    }
    
    public void questao5(){
        System.out.println("Ainda não está pronta!!!");
    }
    

    public static void main(String[] args)  
    {
       new Thread(){
           @Override
           public void run(){
               Main main = new Main();
           }
       }.start();
    }
    
}
