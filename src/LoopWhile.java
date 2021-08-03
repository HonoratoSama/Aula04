import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/

		int idade, qtde, qtde1;
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a Quantidade de alunos : ");
		qtde = sc.nextInt();
		qtde1 = qtde;
		
		while (qtde > 0) {
			System.out.println("Digite a Idade do aluno : ");
			idade = sc.nextInt();
			media = (media + (double)idade);
			qtde = qtde - 1;
		}
		System.out.println("A média de idade entre os alunos é de : " + (media / qtde1) + " anos");
		sc.close();
	}

}
