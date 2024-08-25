# Exercício de Programação Orientada a Objeto

## Prof. Francesco Artur Perrotti – Fatec Americana

  A faculdade deseja fazer um sistema para o pagamento dos professores e funcionários e você foi escolhido para desenvolver o sistema. Professores e funcionários precisam ter o nome, RG e a quantidade de filhos registrados no sistema. Além disso, os professores também precisam ter registrado o curso em que lecionam. Já os funcionários precisam ter o departamento em que trabalham armazenado. Funcionários ganham um valor fixo por mês, mas se faltarem algum dia, será descontado um dia de salário por cada falta. Considere que o mês tem 20 dias úteis e, portanto, cada falta desconta 1/20 do salário do funcionário. 

  Professores ganham por hora aula. A cada mês será registrada a quantidade de aulas que o professor ministrou e esse valor será usado para calcular o salário dele naquele mês. 
Além disso, a faculdade oferece como benefício o vale-coxinha para os funcionários no valor de R$ 42,00 por mês, que é acrescentado ao salário. Professores não recebem esse benefício. Um benefício que vale para todos (professores e funcionários), é o auxílio-procriação que paga R$ 100,00 por mês para cada filho que o professor ou funcionário tenha.

  Faça uma estrutura de classes que atenda os requisitos expostos acima evitando duplicação de código e que contenha os seguintes métodos:

### Para todos:
public double calcularSalario(): retorna o salário do professor ou funcionário.
public void hollerith(): imprime todos os dados do professor ou funcionário, inclusive o salário que irá receber com todos os componentes usados para calcular o salário.
public void zerarMes(): zera as quantidades acumuladas para iniciar um novo mês.

### Para professores:
public void registraAulas(int Qtd): Acumula a quantidade de aulas informada para o professor.

### Para funcionários:
public void registraFalta(): acrescenta uma falta para o funcionário.

### IMPORTANTE: No método main da classe principal crie objetos das classes e teste todos os métodos implementados
