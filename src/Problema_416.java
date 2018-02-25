import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problema_416 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner pr= new Scanner(System.in);
			HashSet<String> fecha= new HashSet<String>();
			int fechaintro=Integer.parseInt(pr.nextLine());
			for(int i=0;fechaintro !=0;i++)
			{
				String entrada=pr.nextLine();
				for (String recorre : Arrays.asList(entrada.split(" "))) {
					fecha.add(recorre.substring(0, recorre.length()-5));
				}
				if (!(fechaintro==fecha.size())) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
				fecha.clear();
				fechaintro=Integer.parseInt(pr.nextLine());
			}
	}

}