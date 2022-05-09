package Aula4;

public class Main {

	public static void main(String[] args) {
		
		Ivetor vetAluno = new Ivetor(10);
		
		vetAluno.adiciona(new Aluno("Iago", 21, 10.0));
		vetAluno.adiciona(new Aluno("Shiriu", 30, 6.0));
		vetAluno.adiciona(new Aluno("DLM", 14, 3.1));

		Aluno alunoTest = new Aluno("DLM", 14, 3.1);
		System.out.println(vetAluno.contem(alunoTest));
		System.out.println(vetAluno.tamanho());

	}

}
