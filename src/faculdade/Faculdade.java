/*
 * The MIT License
 *
 * Copyright 2024 Bruno R. Negri.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package faculdade;

/**
 *
 * @author Bruno R. Negri
 */

public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Funcionario:");
        Funcionario funcionario01 = new Funcionario("Lucas",444555666,2);
        funcionario01.setSalarioBase(2000);
        funcionario01.setFaltas(10);
        double salario = funcionario01.calcularSalario();
        System.out.println("Salario: "+salario);
        System.out.println("\n");
        funcionario01.hollerith();
        
        System.out.println("\n");
        
        System.out.println("Professor:");
        Professor professor01 = new Professor("Rogerio",444556666,1);
        professor01.setAulasDadas(60);
        professor01.setSalarioBase(70);
        salario = professor01.calcularSalario();
        System.out.println("Salario: "+salario);
        System.out.println("\n");
        professor01.hollerith();
                
    }
    
}
