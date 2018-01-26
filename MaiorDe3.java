package MaiorDe3;
import java.util.Scanner;
public class MaiorDe3 {
    static int Maiorde3 (int x,int y,int z)
{if (x<y);
     x=y;
if (x<z)
    x=z;
return x;}


	public static void main(String[] args) {
		int x,y,z;
		Scanner LerS= new Scanner(System.in);
		System.out.print ("Digite o primeiro valor (x)");
		x=LerS.nextInt();
		System.out.print ("Digite o segundo valor (y)");
		y=LerS.nextInt();
		System.out.print ("Digite o terceiro valor (z)");
		z=LerS.nextInt();
		System.out.println ("Maior=" +Maiorde3(x,y,z));

	}

}
