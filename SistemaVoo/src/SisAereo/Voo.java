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
public class Voo {

    private static int num;
    private int numVoo;
    private Piloto piloto;
    private String origem;
    private String destino;
    private String dhSaida;
    private double valorPassagem;
    private int quantMax;
    private int quantVendidas;

    public Voo(Piloto piloto, String origem, String destino, String dhSaida, double valorPassagem, int quantMax) {
        num++;
        numVoo = num;
        this.piloto = piloto;
        this.origem = origem;
        this.destino = destino;
        this.dhSaida = dhSaida;
        this.valorPassagem = valorPassagem;
        this.quantMax = quantMax;
    }
    static Scanner input = new Scanner(System.in);

    public static void cadastrarVoo() {
        System.out.println("Registro do piloto");
        int registro = input.nextInt();
        input.nextLine();
        
        if (SisAereo.pilotos[registro - 1] != null) {

            System.out.println("Origem do voo");
            String origem = input.nextLine();
            System.out.println("Destino do voo");
            String destino = input.nextLine();
            System.out.println("Data e hora de saida");
            String dhSaida = input.nextLine();
            System.out.println("Valor da passagem");
            double valorPassagem = input.nextDouble();
            System.out.println("Quantidade maxima de passageiros");
            int quantMax = input.nextInt();
            for (int i = 0; i < 20; i++) {
                if (SisAereo.Voos[i] == null) {
                    SisAereo.Voos[i] = new Voo(SisAereo.pilotos[registro - 1], origem, destino, dhSaida, valorPassagem, quantMax);
                    break;
                }
            }
        } else {
            System.out.println("Registro inexistente!");
            cadastrarVoo();
        }
    }

    public static void exibirVoo() {
        System.out.println("Digite o numero do voo");
        int numvoo = input.nextInt();
        input.nextLine();
        if (SisAereo.Voos[numvoo - 1] != null) {
            System.out.println("O voo vai de " + SisAereo.Voos[numvoo - 1].origem+ " a " + SisAereo.Voos[numvoo - 1].destino);
            System.out.println("Voo numero " + SisAereo.Voos[numvoo - 1].numVoo);
            System.out.println("Piloto " + SisAereo.Voos[numvoo - 1].piloto.getNome());
            System.out.println("Data de saida " + SisAereo.Voos[numvoo - 1].dhSaida);
            System.out.println("Valor de cada passagem " + SisAereo.Voos[numvoo - 1].valorPassagem + "R$");
            System.out.println("Quantidade maxima de passageiros " + SisAereo.Voos[numvoo - 1].quantMax);
            System.out.println(SisAereo.Voos[numvoo - 1].quantVendidas + " de passagens vendidas");
        }
        else{
            System.out.println("Esse voo não foi cadastrado. Por favor repita.");
            exibirVoo();
        }
    }

    /**
     * @return the numVoo
     */
    public int getNumVoo() {
        return numVoo;
    }

    /**
     * @param numVoo the numVoo to set
     */
    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    /**
     * @return the piloto
     */
    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * @param piloto the piloto to set
     */
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    /**
     * @return the origem
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the dhSaida
     */
    public String getDhSaida() {
        return dhSaida;
    }

    /**
     * @param dhSaida the dhSaida to set
     */
    public void setDhSaida(String dhSaida) {
        this.dhSaida = dhSaida;
    }

    /**
     * @return the valorPassagem
     */
    public double getValorPassagem() {
        return valorPassagem;
    }

    /**
     * @param valorPassagem the valorPassagem to set
     */
    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    /**
     * @return the quantMax
     */
    public int getQuantMax() {
        return quantMax;
    }

    /**
     * @param quantMax the quantMax to set
     */
    public void setQuantMax(int quantMax) {
        this.quantMax = quantMax;
    }

    /**
     * @return the quantVendidas
     */
    public int getQuantVendidas() {
        return quantVendidas;
    }

    /**
     * @param quantVendidas the quantVendidas to set
     */
    public void setQuantVendidas(int quantVendidas) {
        this.quantVendidas = quantVendidas;
    }

}
