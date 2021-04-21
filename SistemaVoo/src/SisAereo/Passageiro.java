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
public class Passageiro {
    private String nome;
    private int idade;
    private String cpf;
    private String cnpj;
    private String telefone;
    private String e_mail;
    private String endereço;

    public Passageiro(String nome, int idade, String cpf, String cnpj, String telefone, String e_mail, String endereço) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.e_mail = e_mail;
        this.endereço = endereço;
    }
    
    static Scanner input = new Scanner(System.in);
    public static void cadastrarPassageiro(){
        System.out.println("Nome");
        String nome = input.nextLine();
        System.out.println("Idade");
        int idade = input.nextInt();
        input.next();
        System.out.println("Digite 1 para CPF ou 2 para CNPJ");
        int tipoD =input.nextInt();
        input.next();
        String cpf = "'-'";
        String cnpj = "'-'";
        
        if (tipoD==1){
            System.out.println("CPF");
            cpf = input.nextLine();
        }else{
            System.out.println("CNPJ");
            cnpj = input.nextLine();
        }
        System.out.println("Telefone");
        int tel = input.nextInt();
        input.next();
        System.out.println("E_mail");
        String email=input.nextLine();
        System.out.println("Endereço");
        String endereço = input.nextLine();
        for (int k = 0; k<20;k++){
            if (SisAereo.passageiros[k]==null){
                SisAereo.passageiros[k]= new Passageiro(nome, idade, cpf, cnpj, nome, email, endereço);
                break;
            }
        }
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the e_mail
     */
    public String getE_mail() {
        return e_mail;
    }

    /**
     * @param e_mail the e_mail to set
     */
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    /**
     * @return the endereço
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}
