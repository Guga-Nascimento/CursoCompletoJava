package parte1ClassesAtributosMetodosEntities;

public class Employee {
	
	public String nome;
	public double grossSalary,tax;
	
	public Employee() {
		
	}
	public double netSalary() {
		 return grossSalary - tax;
		 
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100.0;
		
	}
	@Override
	public String toString() {
		return 
			  	   "Nome: "+ nome
				+"\nSalario Bruto: "+String.format("%.2f",grossSalary)
				+"\nImposto: "+String.format("%.2f%n",tax)
				+"\nDADOS ATUALIZADOS APÓS AUMENTO SALARIAL: "
				+"\nFuncionario: "+nome+"\n"+"R$ "
				;
				
	}
	
	

}
