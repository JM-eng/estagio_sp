public class Main
{
    
	public static void main(String[] args) {
		
		int input=0, n=1, n1=0, n2=0, flag=0;
		
		
		input = 55; 
		
		while(n1 <= input)
		{ 
			if(n1 == input)
			{
			    System.out.println("O número inserido faz parte da sequência de Fibonacci");
			    flag = 1;
			}
			
			n2 = n1;
			n1 = n;
			n = n1 + n2;
		}
		
		if(flag == 0)
		{
		    System.out.println("O número inserido não faz parte da sequência de Fibonacci");
		}
	}

}
