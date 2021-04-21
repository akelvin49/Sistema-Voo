/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisAereo;

import java.util.Scanner;

/**
 *
 * @author kelvin
 */
public class SisAereo {

    /**
     * @param args the command line arguments
     */
    static Piloto[] pilotos = new Piloto[20];
    static Voo[] Voos = new Voo[20];
    static Passagem[] passagens = new Passagem[20];
    static Passageiro[] passageiros = new Passageiro[20];

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1 - Cadastrar Pilotos"
                    + "\n2 - Cadastrar os Voos"
                    + "\n3 - Cadastrar Cliente"
                    + "\n4 - Vender Passagens"
                    + "\n5 - Exibir Informações dos Voos"
                    + "\n6 - Exibir Informações dos Clientes"
                    + "\n7 - Exibir Informações dos Pilotos"
                    + "\n8 - Exibir Passagem"
                    + "\n0 - Sair do Sistema");

            int menu = input.nextInt();
            if (menu == 0) {
                break;
            }

            switch (menu) {
                case 1:
                    Piloto.cadastrarPiloto();
                    break;
                case 2:
                    Voo.cadastrarVoo();
                    break;
                case 3:
                    Passageiro.cadastrarPassageiro();
                    break;
                case 4:
                    break;
                case 5:
                    Voo.exibirVoo();
                    break;
                default:
                    break;
            }
        } while (true);
    }

}
