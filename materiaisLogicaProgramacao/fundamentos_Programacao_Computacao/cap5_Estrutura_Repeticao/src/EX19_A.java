import java.util.*;
public class EX19_A
{
  public static void main (String args[])
  	{
  		Scanner dado = new Scanner(System.in);
  		int m, n, soma, i;
  		System.out.println("Digite um valor para m ");
  		m = dado.nextInt();
  		System.out.println("Digite um valor para n ");
  		n = dado.nextInt();
  		while (m < n)
    	{ 
    		soma = 0;
      		for (i=m;i<=n;i++)
				soma = soma + i;
			System.out.println("Soma dos inteiros entre "+m+" e "+n+" = "+soma);
			System.out.println("Digite um valor para m ");
			m = dado.nextInt();
			System.out.println("Digite um valor para n ");
      		n = dado.nextInt();
    	}
  	}
}