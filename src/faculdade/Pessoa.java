/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author bruna
 */
public class Pessoa {
    
    private String nome;
    private int rg;
    private int numeroDeFilhos;
    private static final double auxilioProcriacao = 100;
    private double salario;
    private double salarioBase;
    
    public Pessoa(String nome, int rg, int numeroDeFilhos){
        this.nome = nome;
        this.rg = rg;
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public double calcularSalario() {
        System.out.println("Calculando salário:");
        return 0;
    }

    public void hollerith() {
        System.out.println("Dados da pessoa:");
    }

    public void zerarMes() {
        System.out.println("Zerando pontos:");
    }
    
    public double calcularAuxilioProcriacao(int numerDeFilhos, double auxilioProcriacao){
        double auxilio = numerDeFilhos * auxilioProcriacao;
        return auxilio;
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
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the numeroDeFilhos
     */
    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    /**
     * @param numeroDeFilhos the numeroDeFilhos to set
     */
    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }

    /**
     * @return the auxilioProcriacao
     */
    public static double getAuxilioProcriacao() {
        return auxilioProcriacao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
