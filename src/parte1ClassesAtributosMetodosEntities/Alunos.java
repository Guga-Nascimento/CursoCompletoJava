package parte1ClassesAtributosMetodosEntities;

public class Alunos {
	
	public String name;
	public double nota1,nota2,nota3;
	
	public Alunos() {
	}
	public double mediaFinal() {
		return nota1+nota2+nota3;
	}
	public double pontosQueFaltaram() {
		return nota1 + nota2 + nota3 -60;
	}
	

}
