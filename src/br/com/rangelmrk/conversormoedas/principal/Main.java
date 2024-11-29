package br.com.rangelmrk.conversormoedas.principal;

import br.com.rangelmrk.conversormoedas.classes.Conversoes;
import br.com.rangelmrk.conversormoedas.classes.Opcoes;
import br.com.rangelmrk.conversormoedas.classes.Solicitador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Opcoes opcoes = new Opcoes();

        System.out.println(
                """
                 _____________________________________________________________
                
                Olá bem vindo ao conversor de Moedas (beta)!
                
                _____________________________________________________________
                """);




        opcoes.listarOpcoes();

        System.out.println("Escolha a opção de conversão que deseja realizar (1-10):");
        int inputOpcao = 0;

        try {
            inputOpcao = input.nextInt();
            if (inputOpcao < 1 || inputOpcao > 10) {
                System.out.println("Esta opção não é válida, por favor, escolha um número entre 1 e 10.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            input.next();
            return;
        }

        Conversoes opcao = opcoes.getOpcao(inputOpcao);

        System.out.println("Escreva o valor que deseja ser convertido:");
        double valor = 0;

        try {
            valor = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número válido para o valor.");
            input.next();
            return;
        } finally {
            input.close();
        }

        Solicitador conversao = new Solicitador();
        double resultado = conversao.solicitador(opcao.getMoedaOrigem(), opcao.getMoedaDestino(), valor)
                .conversion_result();

        System.out.printf("O valor de %.2f %s na taxa de conversão atual é: %.2f %s%n",
                valor, opcao.getMoedaOrigem(), resultado, opcao.getMoedaDestino());
    }
}