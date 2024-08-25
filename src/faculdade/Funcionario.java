/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author bruna
 */
public class Funcionario extends Pessoa{
    
    private String departamento;
    private static final double valeCoxinha = 42;
    private int faltas;
    
    public Funcionario(String nome, int rg, int numeroDeFilhos) {
        super(nome, rg, numeroDeFilhos);
    }
    
    
    public void registrarFaltas(int falta){
        System.out.println("Registrando faltas");
        falta += getFaltas();
        setFaltas(falta);
    }
    
    
    @Override
    public double calcularSalario() {
        System.out.println("Calculando salário:");
        double salarioBase = getSalarioBase();
        int faltas = getFaltas();
        double salario;
        double auxilioProcriacao = calcularAuxilioProcriacao(getNumeroDeFilhos(), getAuxilioProcriacao());
        if(faltas == 0){
            salario = salarioBase + valeCoxinha + auxilioProcriacao;
            setSalario(salario);
            return salario;
        }
        double descontoAux = calcularDesconto(faltas);
        salario = salarioBase - descontoAux + valeCoxinha + auxilioProcriacao;
        setSalario(salario);
        return salario;
    }
    
    @Override
    public void hollerith() {
        double auxilioProcriacao = calcularAuxilioProcriacao(getNumeroDeFilhos(), getAuxilioProcriacao());
        int faltas = getFaltas();
        double descontoAux = calcularDesconto(faltas);
        
        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: "+getNome());
        System.out.println("RG: "+getRg());
        System.out.println("Número de filhos: "+getNumeroDeFilhos());
        System.out.println("--- Salário ---");
        System.out.println("(+)Salário base: "+getSalarioBase());
        System.out.println("(+)Vale coxinha: "+getValeCoxinha());
        System.out.println("(+)Auxílio Procriação: "+auxilioProcriacao);
        System.out.println("(-)Desconto pelas faltas: "+descontoAux+" | Número de faltas: "+faltas+" de 20");
        System.out.println("Salário final: "+getSalario());
              
    }
    
    public double calcularDesconto(int faltas){
        double salarioBase = getSalarioBase();
        double descontoAux = salarioBase*(faltas/20.0);
        return descontoAux;
    }

    public void zerarMes() {
        System.out.println("Zerando pontos:");
    }
    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the valeCoxinha
     */
    public static double getValeCoxinha() {
        return valeCoxinha;
    }
}
