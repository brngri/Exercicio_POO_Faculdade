/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author bruna
 */
public class Professor extends Pessoa{
    
    private String curso;
    private int aulasDadas = 0;
    
    public Professor(String nome, int rg, int numeroDeFilhos) {
        super(nome, rg, numeroDeFilhos);
    } 
    
    public void registraAulas(int aulaDada){
        System.out.println("Registrando aulas dadas...");
        aulaDada += getAulasDadas();
        setAulasDadas(aulaDada);
    }
    
    public double calcularSalario() {
        System.out.println("Calculando salário:");
        double salarioBase = getSalarioBase();
        double auxilioProcriacao = calcularAuxilioProcriacao(getNumeroDeFilhos(), getAuxilioProcriacao());
        int aulasDadas = getAulasDadas();
        if(aulasDadas == 0){
            return 0;
        }
        double salario = salarioBase * aulasDadas + auxilioProcriacao;
        setSalario(salario);
        return salario;
    }
    
    
    public void hollerith() {
        double auxilioProcriacao = calcularAuxilioProcriacao(getNumeroDeFilhos(), getAuxilioProcriacao());
        int aulasDadas = getAulasDadas();
        double salarioBase = getSalarioBase();
        double salarioBaseVezesAulas = aulasDadas * salarioBase;
        
        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: "+getNome());
        System.out.println("RG: "+getRg());
        System.out.println("Número de filhos: "+getNumeroDeFilhos());
        System.out.println("--- Salário ---");
        System.out.println("(+)Salário do Mês: "+salarioBase+" X "+aulasDadas+" = "+salarioBaseVezesAulas);
        System.out.println("(+)Auxílio Procriação: "+auxilioProcriacao);
        System.out.println("Salário final: "+getSalario());
              
    }
    
    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the aulasDadas
     */
    public int getAulasDadas() {
        return aulasDadas;
    }

    /**
     * @param aulasDadas the aulasDadas to set
     */
    public void setAulasDadas(int aulasDadas) {
        this.aulasDadas = aulasDadas;
    }
    
    
}
