package MenorDe3;
import java.util.Scanner;
public class MenorDe3 {
    private static Scanner lerS;


	static int Menorde3 (int x,int y,int z)
{if (x>y)
     x=y;
if (x>z)
    x=z;
return x;}
	public static void main(String[] args) {
		int x,y,z;
		lerS = new Scanner(System.in);
		System.out.print ("Digite o primeiro valor (x)");
		x=lerS.nextInt();
		System.out.print ("Digite o segundo valor (y)");
		y=lerS.nextInt();
		System.out.print ("Digite o terceiro valor (z)");
		z=lerS.nextInt();
		System.out.println ("Menor=" +Menorde3(x,y,z));		

	}

}
