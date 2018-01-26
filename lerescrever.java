package NotaProgramacao;
import java.util.Scanner;
public class lerescrever {
	
	static int lerescrever (int nota) {
		Scanner LerS = new Scanner (System.in);
		System.out.print("Qual a nota à disciplina de programação");
		nota = LerS.nextInt();
	return nota; }

	public static void main(String[] args) throws Exception
	{int nota=0;
	int [] Armario = new int [26];
	for (int aluno=1;aluno<26; aluno++)
	Armario [aluno] = lerescrever(nota);
	for (int aluno=1; aluno < 26; aluno++)

	System.out.println(aluno+"-"+Armario [aluno]);}
			
	}
	