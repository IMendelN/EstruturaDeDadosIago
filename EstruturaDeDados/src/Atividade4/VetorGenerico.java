package Atividade4;

public class VetorGenerico {

	private int val = 0;
	private Object alunos[];

	public VetorGenerico(int tam) {
		this.alunos = new Object[tam];
	}

	public void adiciona(Object aluno) {
		if (!cheio(aluno)) {
			this.alunos[val] = aluno;
			this.val++;
		} else {
			remove(aluno);
			System.out.println("!Vetor Cheio!");
		}

	}

	public int tamanho() {
		return val;
	}

	public boolean contem(Object aluno) {
		for (int i = 0; i < val; i++) {
			if (alunos[i] != null) {
				if ((alunos[i]).equals(( aluno))) {
					return true;

				}
			}
		}
		return false;
	}

	public boolean cheio(Object aluno) {
		if (val == alunos.length) {
			return true;
		}

		return false;
	}

	public boolean remove(Object aluno) {
		if (this.cheio(aluno)) {
			Object newVet[] = new Object[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				newVet[i] = this.alunos[i];

			}
			this.alunos = newVet;
			return true;
		}
		return false;
	}

}