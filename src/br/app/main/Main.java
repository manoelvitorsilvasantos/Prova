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
        int n1 = 0, n2 = 1, n3 = 0, i;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de x >> ");
        i = scan.nextInt();
        
        while(i < n3)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        
        if(i == 0){
            System.out.println("O numero 0 está na sequência de fibonnaci. \n0 próximo número é: 1");
        }
        else if(i == n3){
            System.out.println("O numero " + i +" está na sequência de fibonnaci. \n0 próximo número é: " + (n1 + i));
        }
        else{
            System.out.println("Esse número não faz parte da sequência de fibonnaci!");
        }
    }
    
    public void questao3(){
        
    }
    
    public void questao4(){
        System.out.println("Ainda não está pronta!!!");
    }
    
    public void questao5(){
        Scanner scan = new Scanner(System.in);
        String texto = null;
        String reverso = "";
        System.out.println("Digite um nome: ");
        texto = scan.nextLine();
        int cont = texto.length()-1;
        
        
        for(int i = cont; 0 <= i; i--){
            reverso += texto.charAt(cont);
            cont  = cont - 1 ;
        }
        
        System.out.println(String.valueOf(reverso));
        
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
