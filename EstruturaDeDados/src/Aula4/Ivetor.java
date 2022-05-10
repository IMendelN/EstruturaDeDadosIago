package Aula4;

public class Ivetor implements IVetorI {

	private int val = 0;
	private Aluno alunos[];

	public Ivetor(int tam) {
		this.alunos = new Aluno[tam];
	}

	public void adiciona(Aluno aluno) {
		if (!cheio(aluno)) {
			this.alunos[val] = aluno;
			this.val++;
		} else {
			garanteEspaco(aluno);
			System.out.println("!Vetor Cheio!");
		}

	}

	public int tamanho() {
		return val;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < val; i++) {
			if (alunos[i] != null) {
				if (this.alunos[i].getNome().equals(aluno.getNome())) {
					return true;

				}
			}
		}
		return false;
	}

	public boolean cheio(Aluno aluno) {
		if (val == alunos.length) {
			return true;
		}

		return false;
	}

	public boolean remove(Aluno aluno) {
		if (this.cheio(aluno)) {
			Aluno newVet[] = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				newVet[i] = this.alunos[i];

			}
			this.alunos = newVet;
			return true;
		}
		return false;
	}

}