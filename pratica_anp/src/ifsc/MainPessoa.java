package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setCpf("12345678");
		aluno1.setNome("cleito");
		aluno1.setMatricula(123456789);
		
		Professor p1 = new Professor();
		p1.setCpf("12345678");
		p1.setNome("robsu");
		p1.setSiape(123456789);
		
		System.out.println("CPF do aluno é: "+aluno1.getCpf());
		System.out.println("Nome do aluno é: "+aluno1.getNome());
		System.out.println("Matricula do aluno é: "+aluno1.matricula());
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("CPF do professor é: "+p1.getCpf());
		System.out.println("Nome do professsor é: "+p1.getNome());
		System.out.println("Siape do professor é: "+p1.getSiape());
		
	}

}
