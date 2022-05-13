package Atividade2;

public class Vetor {

	private int val = 0;
	private Aluno alunos[];

	public Vetor(int tam) {
		this.alunos = new Aluno[tam];
	}

	public void adiciona(Aluno aluno) {
		this.alunos[val] = aluno;
		this.val++;
	}

	public int tamanho() {
		return val;
	}

	public boolean contem(Aluno aluno){
		for(int i = 0; i < val; i++) {
			if (aluno != this.alunos[i]) {
				return true;
			}
		}
		return false;
	}
}
