package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone { 
    public static void main(String[] args) {
        Contato contato = new Contato();
        Scanner ler = new Scanner(System.in);
    String nome;
    String numero;

    System.out.println("Entre com o nome do contato");
     nome = ler.next();
    System.out.println("Entre com numero contato");
     numero = ler.next(); 

 if (numero.length() != 9) {
        System.out.println("ERRO");
 }       
}
}


 