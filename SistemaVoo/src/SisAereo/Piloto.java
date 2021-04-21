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
public class Piloto {
    static private int registro;
    private int numRegistro;
    private String nome;
    private int idade;
    private String horasVoo;

    public Piloto(String nome, int idade, String horasVoo) {
        registro++;
        numRegistro = registro;
        this.nome = nome;
        this.idade = idade;
        this.horasVoo = horasVoo;
    }
    
    static Scanner input = new Scanner(System.in);
    
    public static void cadastrarPiloto (){
        System.out.println("Nome do Piloto");
        String nome = input.nextLine();
        System.out.println("Idade");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Horario do voo");
        String horasVoo = input.nextLine();
        
        for (int i = 0; i<20;i++){
            if (SisAereo.pilotos[i]==null){
                SisAereo.pilotos[i]= new Piloto(nome, idade, horasVoo);
                break;
            }
        }        
        
    }

    /**
     * @return the registro
     */
    public int getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the horasVoo
     */
    public String getHorasVoo() {
        return horasVoo;
    }

    /**
     * @param horasVoo the horasVoo to set
     */
    public void setHorasVoo(String horasVoo) {
        this.horasVoo = horasVoo;
    }
}
